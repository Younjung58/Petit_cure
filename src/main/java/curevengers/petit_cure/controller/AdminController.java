package curevengers.petit_cure.controller;

import curevengers.petit_cure.Dao.MemberMapper;
import curevengers.petit_cure.Dto.*;
import curevengers.petit_cure.Service.allBoardService;
import curevengers.petit_cure.Service.dpBoardService;
import curevengers.petit_cure.Service.userService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    allBoardService allboardservice;

    @Autowired
    MemberMapper memberMapper;

    @Autowired
    dpBoardService dpboardservice;

    @Autowired
    userService userservice;

    @GetMapping(value = "/alert")
    public String alert(Model model, @ModelAttribute pageDTO pagedto) {
        if(pagedto.getPage() == null){      // 디폴트값 세팅
            pagedto.setPage(1);
        }
        List<alertDTO> list = allboardservice.alertList();
        pagedto.setTotalCount(list.size());
        List<alertDTO> alertlist = allboardservice.findalertAllBoards(pagedto);
//        System.out.println(list.size() +" / 현재 저장되어있는 신고글 갯수");
        model.addAttribute("pageDTO", pagedto);
        model.addAttribute("list", alertlist);
        return "alertPage";
    }

    @GetMapping(value="/alertview")
    public String alertQAview(HttpSession session, @RequestParam("no") int no,
                              @RequestParam("cate") String cate,Model model,
                              @RequestParam("singonum") String singonum,
                              @ModelAttribute memberDTO memberdto, alertDTO alertdto) throws Exception {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        // 관리자를 확인하기 위하여 정보 가져올것
        session.setAttribute("id", username);

        alertdto.setNo(no);
        String category =cate;

        System.out.println(category+" / 넘어온 카테고리 확인");

        if(category.equals("Q&A게시판")){
            QABoardDTO board = allboardservice.getQABoardNo(String.valueOf(no));
            alertdto.setAlert_cate("Q&A게시판");
            model.addAttribute("board", board);
        }else if(category.equals("자유게시판")){
            freeBoardDTO board = allboardservice.getBoardNo(String.valueOf(no));
            alertdto.setAlert_cate("자유게시판");
            model.addAttribute("board", board);
        }else{
            dpBoardDTO board = dpboardservice.selectOne(no);
            alertdto.setAlert_cate("우울증게시판");
            board.setCate("우울증게시판");
            model.addAttribute("board", board);
        }

        List<alertDTO> alert = allboardservice.selectAlertcomment(alertdto);
        model.addAttribute("singonum", singonum);
        model.addAttribute("nowcate", category);
        model.addAttribute("alertList", alert);

        return "alertview";
    }



    // 관리자에 의한 Q&A게시판 글 삭제기능
    @GetMapping(value = "/deleteQAalert")
    public String deleteqaBoard(@RequestParam("no") String no, alertDTO alertDTO) throws Exception {
        System.out.println(no+" / Q&A에서 삭제하려는 번호----------------");
        alertDTO.setNo(Integer.valueOf(no));
        alertDTO.setAlert_cate("Q&A게시판");
        allboardservice.deleteQABoard(no);
        allboardservice.deleteAlert(alertDTO);
        return "redirect:/alert";

    }

    // 관리자에 의한 자유게시판 글 삭제기능
    @GetMapping(value = "/deleteFreealert")
    public String deletefreeBoard(@RequestParam("no") String no, alertDTO alertDTO) throws Exception {
        System.out.println(no+" / 자유게시판에서 삭제하려는 번호----------------");
        alertDTO.setNo(Integer.valueOf(no));
        alertDTO.setAlert_cate("자유게시판");
        allboardservice.deleteBoard(no);
        allboardservice.deleteAlert(alertDTO);
        return "redirect:/alert";
    }

    // 관리자에 의한 자유게시판 글 삭제기능
    @GetMapping(value = "/deleteDepalert")
    public String deleteDepalert(@RequestParam("no") String no, alertDTO alertDTO) throws Exception {
        System.out.println(no+" / 우울증게시판에서 삭제하려는 번호----------------");
        alertDTO.setNo(Integer.valueOf(no));
        alertDTO.setAlert_cate("우울증게시판");
        dpboardservice.deletedpBoard(Integer.valueOf(no));
        allboardservice.deleteAlert(alertDTO);
        return "redirect:/alert";
    }

    @ResponseBody
    @GetMapping(value = "/stopUser")
    public int stopUser(blackListDTO blacklistdto, memberDTO memberdto) throws Exception {
        memberdto.setId(blacklistdto.getId());
        memberdto.setAuth_name("BLACKLIST");
        userservice.addBlacklist(blacklistdto);
        return userservice.updateBlacklist(memberdto);
    }
}
