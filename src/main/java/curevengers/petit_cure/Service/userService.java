package curevengers.petit_cure.Service;


import curevengers.petit_cure.Dto.memberDTO;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

public interface userService {
    public List<memberDTO> getMemberList();
    public memberDTO getMemberById(String id);
    public void signup(memberDTO memberdto);
    public void edit(memberDTO memberdto);
    public void withdraw(String id);
    public PasswordEncoder passwordEncoder();
    public int cofrmID(String id);
}