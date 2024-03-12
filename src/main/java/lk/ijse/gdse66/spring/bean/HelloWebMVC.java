package lk.ijse.gdse66.spring.bean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWebMVC {
    public HelloWebMVC() {
        System.out.println("Hello web MVC");
    }

    @GetMapping
    public String getGetMethod(){
        System.out.println("Get Method");
        return "Received GET request";
    }
}
