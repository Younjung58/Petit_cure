package curevengers.petit_cure.security.userdetailsservice;

import curevengers.petit_cure.security.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService{

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDetails userDetails = adminRepository.getUserDetails(username);

        if(userDetails == null) {
            throw new UsernameNotFoundException("유효하지 않는 로그인 정보입니다.");
        }

        return userDetails;
    }

}
