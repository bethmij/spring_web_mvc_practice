package lk.ijse.gdse66.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    //    @GetMapping
    //    public String getOrders(){
    //        return "getOrders()";
    //    }

    @GetMapping
    public String getOrders(@RequestHeader("X-token") String token){
        return String.format("getOrders(String token) : %s",token);
    }


}
