package curevengers.petit_cure.Service;

import curevengers.petit_cure.Dto.dpBoardDTO;
import curevengers.petit_cure.Dto.dpcommentDTO;
import curevengers.petit_cure.Dto.freecommentDTO;
import curevengers.petit_cure.Dto.qacommentDTO;

import java.util.List;

public interface dpBoardService {
    public List<dpBoardDTO> selectAll() throws Exception;

    public int countAll() throws Exception;

    public void insert(dpBoardDTO dto) throws Exception;

    public dpBoardDTO selectOne(int no) throws Exception;

    public List<dpcommentDTO> getdpComment(int no) throws Exception;

    public void updateGoodUP(int no) throws Exception;

    public void updateGoodDown(int no) throws Exception;

    public void adddpComment(dpcommentDTO dto) throws Exception;

    public void updatedpBoard(dpBoardDTO dto) throws Exception;

    public void deletedpBoard(int no) throws Exception;

    public List<dpBoardDTO> getsearchDPBoards(String title) throws Exception;
}
