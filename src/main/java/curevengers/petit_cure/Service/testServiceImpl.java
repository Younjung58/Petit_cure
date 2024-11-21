package curevengers.petit_cure.Service;

import curevengers.petit_cure.Dao.UserMapper;
import curevengers.petit_cure.Dto.freeBoardDTO;
import curevengers.petit_cure.Dto.testDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testServiceImpl implements testService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void add(testDto dto) {
        System.out.println("서비스창");
        userMapper.insert(dto);
    }

    @Override
    public List<freeBoardDTO> getAllFreeBoards() {
        try {
            return userMapper.findAllBoards();
        } catch (Exception e) {
            // 예외 로그 출력
            e.printStackTrace();
            throw new RuntimeException("게시판 조회에 실패했습니다.");
        }
    }

    @Override
    public freeBoardDTO getBoardNo(String no) {
        return userMapper.selectOne(no);
    }


}
