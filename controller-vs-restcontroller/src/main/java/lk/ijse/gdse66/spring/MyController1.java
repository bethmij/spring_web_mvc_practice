package lk.ijse.gdse66.spring;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class MyController1 {

    @GetMapping
    public String getMethod(){
        return "Received GET request";
    }
}
