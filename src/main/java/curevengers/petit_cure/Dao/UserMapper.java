package curevengers.petit_cure.Dao;

import curevengers.petit_cure.Dto.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    //    @Insert("Insert Into 연결test values (#{id})") void insert(String id);
    public void insert(testDto dto);

    List<freeBoardDTO> findAllBoards(pageDTO pagedto);

    List<QABoardDTO> findQAAllBoards(pageDTO pagedto);

    freeBoardDTO selectOne(String no);

    QABoardDTO selectQAOne(String no);

    void insertFreeBoard(freeBoardDTO dto);

    void insertQABoard(QABoardDTO dto);

    List<freeBoardDTO> findSearchBoards(String title);

    List<QABoardDTO> findSearchQABoards(String title);

    void updateVisit(int no);


    void updateGood(int no);

    void updateGoodDown(int no);


    int cntBoard();

    int cntQABoard();

    void insertComment(commentDTO dto);

    List<commentDTO> selectQAComment(String no);

//    List<commentDTO> findComment(commentDTO dto);
}
