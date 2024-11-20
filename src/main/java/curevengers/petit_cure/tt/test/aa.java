package curevengers.petit_cure.tt.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@Controller
public class  aa {
    @GetMapping(value = "/")
    public String hello(){
        return "hello";
    }
}
