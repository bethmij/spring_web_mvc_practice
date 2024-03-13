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

/*----------------  path mapping ---------------*/
    @GetMapping(path = "/ijse")
    public String getMethod2(){
        return "getMethod 2";
    }

    @GetMapping("/ijse/gdse66")
    public String getMethod3(){
        return "getMethod 3";
    }

/*----------------  character mapping -----------------*/

    @GetMapping("/gdse??")
    public String getMethod4(){
        return "getMethod 4";
    }

    @GetMapping("/gd??se66")
    public String getMethod5(){
        return "getMethod 5";
    }

/*-------------  wild card mapping -----------------*/

//    @GetMapping("/ijse/galle/*")
////    @GetMapping("/ijse/*/galle")
////    @GetMapping("/ijse/*/*/galle")
//    public String getMethod6(){
//        return "getMethod 6";
//    }

    @GetMapping("/ijse/**" )
//    @GetMapping("/ijse/**/galle")
    public String getMethod7(){
        return "getMethod 7";
    }

    @GetMapping("/bat*ch")
    public String getMethod8(){
        return "getMethod 8";
    }


}
