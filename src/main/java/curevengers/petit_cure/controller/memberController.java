package curevengers.petit_cure.controller;

import curevengers.petit_cure.Dto.memberDTO;
import curevengers.petit_cure.Service.UserServiceImpl;
import curevengers.petit_cure.kakaoapi.KakaoApi;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@Controller
public class memberController {



    @Autowired
    UserServiceImpl userservice;

    @Autowired
    private final KakaoApi kakaoApi;
    @Autowired
    private PasswordEncoder passwordEncoder;

    // 회원가입화면
    @GetMapping(value = "/mplus")
    public String mplus() {
        return "mplus";
    }

    // 회원가입버튼 - 정보 전달
    @PostMapping(value = "/memplus")
    public String memplus(@ModelAttribute memberDTO memberdto) {
        userservice.signup(memberdto);
        return "redirect:/login";
    }
    
    // 회원가입시 아이디 중복 체크
    @ResponseBody
    @GetMapping(value = "/idCheck")
    public int idCheck(@RequestParam("id") String id) {
        System.out.println("아이디 확인 중");
        return userservice.cofrmID(id);
    }
    
    // 로그인 화면
    @GetMapping("/login")
    public String loginPage(Model model) { // 로그인되지 않은 상태이면 로그인 페이지를, 로그인된 상태이면 main 페이지를 보여줌
        model.addAttribute("KakaoapiKey",kakaoApi.getKakaoapiKey());
        model.addAttribute("redirectUrl",kakaoApi.getKakaoredirectUri());
        return "login";

    }
    
    
    // 로그인 버튼
    @PostMapping("/logincon")
    public String logincon(@RequestParam("username") String username, @RequestParam("password") String password) {
        return "redirect:/";
    }
    
    // 마이페이지로 이동
    @GetMapping("/mypage")
    public String mypage() {
        return "MyPage";
    }

}

