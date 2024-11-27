package curevengers.petit_cure.security.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdminRepository {
    UserDetails getUserDetails(String username);
}
