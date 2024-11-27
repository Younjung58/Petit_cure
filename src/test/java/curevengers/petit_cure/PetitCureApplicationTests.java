package curevengers.petit_cure;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetailsService;

@SpringBootTest
class PetitCureApplicationTests {

    @Autowired
    private UserDetailsService userDetailsService;

    @Test
    void contextLoads() {
        System.out.println("abc");
        System.out.println(userDetailsService);
    }

}
