package Znach;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class logcontroller {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    @RequestMapping("/register")
    public String register() {
        return "register";
    }
    @RequestMapping("/home")
    public String home() {
        return "home";
    }    
        @RequestMapping("/knopka")
        public String knopka() {
            return "knopka";
}
}