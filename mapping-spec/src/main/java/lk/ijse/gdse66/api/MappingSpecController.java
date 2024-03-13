package lk.ijse.gdse66.api;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class MappingSpecController {
    public MappingSpecController() {
        System.out.println("MappingSpecController - constructor");
    }

    @GetMapping
    public String getMethod(){
        return "getMethod()";
    }


}
