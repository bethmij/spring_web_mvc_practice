package lk.ijse.gdse66.api;

import lk.ijse.gdse66.dto.CustomerDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

/*    @GetMapping
    public String getMethod(){
        return "Received GET request";
    }*/

    /*---------- path variables -----------*/

/*    @GetMapping("/{city}")
    public String getCustomerByCity(@PathVariable("city") String city){
        return String.format("getCustomerByCity(String city): %s", city);
    }*/

    @GetMapping("/{city}/{name}")
    public String getCustomerByCityName(@PathVariable("city") String cusCity, @PathVariable("name") String cusName){
        return String.format("getCustomerByCityName(String cusCity, String cusName): %s, %s", cusCity, cusName);
    }

    @GetMapping("/{id:C00-\\d{3}}")
    public String getCustomerByID(@PathVariable("id") String cusID){
        return String.format("getCustomerByID (String cusID) : %s",cusID);
    }

   /*------------ query parameter ---------------*/

    /*@GetMapping
    public String getMethodWithParam1(String id){
        return String.format("getMethodWithParam1(String id) : %s", id);
    }*/

    @GetMapping(params = "id")
    public String getMethodWithParam1(@RequestParam(value = "id") String id){
        return String.format("getMethodWithParam1(String id) : %s", id);
    }

    @GetMapping
    public String getMethodWithParam2(@RequestParam(value = "CusAge", required = false) String age){
        return String.format("getMethodWithParam2(String age): %s",age);
    }

    @GetMapping(params = {"id", "name", "age"})
    public String getMethodWithParam3(@RequestParam("id") String cusId, @RequestParam("name") String name, @RequestParam("age") int age){
        return String.format(
                "getMethodWithParam3(String id, String name, int age): %s, %s, %s"
                ,cusId,name,age);
    }

    /* ---------- application/x-www-form-urlencoded OR query parameters ---------    */

//    @PostMapping
//    public String SaveCustomer(String id, String name, int age){
//        return String.format(
//                "SaveCustomer(String id, String name, int age): %s, %s, %s",
//                id,name,age);
//    }

    @PostMapping
    public String SaveCustomer(@ModelAttribute CustomerDTO customer){
        return customer.toString();
    }

}
