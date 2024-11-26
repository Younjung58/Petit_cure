package curevengers.petit_cure.Service;

import curevengers.petit_cure.Dto.QABoardDTO;
import curevengers.petit_cure.Dto.freeBoardDTO;
import curevengers.petit_cure.Dto.pageDTO;
import curevengers.petit_cure.Dto.testDto;

import java.util.List;

public interface testService {


//    int totalCountBoard();

    public void add(testDto dto);

    //게시판 글 조회
    List<freeBoardDTO> getAllFreeBoards(pageDTO pagedto);

    List<QABoardDTO> getAllQABoards(pageDTO pagedto);

    // 게시판 글 자세히보기
    // 게시판 번호에 따름
    freeBoardDTO getBoardNo(String no);

    QABoardDTO getQABoardNo(String no);

    // 게시판 글 저장
    void addFreeBoard(freeBoardDTO dto);

    void addQABoard(QABoardDTO dto);


    List<freeBoardDTO> getsearchFreeBoards(String title);

    List<QABoardDTO> getsearchQABoards(String title);

    // 조회수 구현
    public void updateVisit(int no);

    // 좋아요 구현
    void updateGood(int no);

    // 좋아요 취소 구현
    void updateGoodDown(int no);


    int totalCountBoard();
}
