package board.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

//    @RequestMapping("/test")
//    public String test() {
//        return "test";
//    }

    @RequestMapping("/user/index2")
    public String test2() {
        return "user/index2";
    }

    @RequestMapping("/index")
    public String test3() {
        return "index";
    }
}
