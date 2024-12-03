package curevengers.petit_cure.Service;

import curevengers.petit_cure.Dao.UserMapper;
import curevengers.petit_cure.Dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testServiceImpl implements testService {

    @Autowired
    UserMapper userMapper;

//    @Override
//    public int totalCountBoard() {
//        return userMapper.cntBoard();
//    }

    @Override
    public void add(testDto dto) {
        System.out.println("서비스창");
        userMapper.insert(dto);
    }

    @Override
    public List<freeBoardDTO> getAllFreeBoards(pageDTO pagedto) {
        try {
            return userMapper.findAllBoards(pagedto);
        } catch (Exception e) {
            // 예외 로그 출력
            e.printStackTrace();
            throw new RuntimeException("자유게시판 조회에 실패했습니다.");
        }
    }

    @Override
    public List<QABoardDTO> getAllQABoards(pageDTO pagedto) {
        try {
            return userMapper.findQAAllBoards(pagedto);
        } catch (Exception e) {
            // 예외 로그 출력
            e.printStackTrace();
            throw new RuntimeException("QA게시판 조회에 실패했습니다.");
        }
    }

    @Override
    public freeBoardDTO getBoardNo(String no) {
        return userMapper.selectOne(no);
    }

    @Override
    public QABoardDTO getQABoardNo(String no) {
        return userMapper.selectQAOne(no);
    }

    @Override
    public void addFreeBoard(freeBoardDTO dto) {
        userMapper.insertFreeBoard(dto);
    }

    @Override
    public void addQABoard(QABoardDTO dto) {
        userMapper.insertQABoard(dto);
    }

    @Override
    public List<freeBoardDTO> getsearchFreeBoards(String title) {
        return userMapper.findSearchBoards(title);
    }

    @Override
    public List<QABoardDTO> getsearchQABoards(String title) {
        return userMapper.findSearchQABoards(title);
    }

    @Override
    public void updateVisit(int no) {
        userMapper.updateVisit(no);
    }

    @Override
    public void updateGood(int no) {
        userMapper.updateGood(no);
    }

    @Override
    public void updateGoodDown(int no) {
        userMapper.updateGoodDown(no);
    }

    @Override
    public int totalCountBoard() {
        return userMapper.cntBoard();
    }

    @Override
    public int totalQACountBoard() {
        return userMapper.cntQABoard();
    }

    @Override
    public void addComment(qacommentDTO dto) {
        userMapper.insertComment(dto);
    }

    @Override
    public void addFreeComment(freecommentDTO dto) {
        userMapper.insertFreeComment(dto);
    }

    @Override
    public List<qacommentDTO> getqaComment(String no) {
        return userMapper.selectQAComment(no);
    }

    @Override
    public List<freecommentDTO> getFreeComment(String no) {
        return userMapper.selectFreeComment(no);
    }

//    @Override
//    public List<commentDTO> getAllComments(commentDTO dto) {
//        return userMapper.findComment(dto);
//    }


}
