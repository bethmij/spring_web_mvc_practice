package lk.ijse.gdse66.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/two")
public class MyController2 {

    @GetMapping
    public String getMethod(){
        return "something";
    }
}
