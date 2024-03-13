package lk.ijse.gdse66.api;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public String getMethod(){
        return "Received GET request";
    }

    /*---------- path variables -----------*/
//    @GetMapping("/{city}")
//    public String getCustomerByCity(@PathVariable("city") String city){
//        return String.format("getCustomerByCity(String city): %s", city);
//    }

    @GetMapping("/{city}/{name}")
    public String getCustomerByCityName(@PathVariable("city") String cusCity, @PathVariable("name") String cusName){
        return String.format("getCustomerByCityName(String cusCity, String cusName): %s, %s", cusCity, cusName);
    }

    @GetMapping("/{id:C00-\\d{3}}")
    public String getCustomerByID(@PathVariable("id") String cusID){
        return String.format("getCustomerByID (String cusID) : %s",cusID);
    }

}
