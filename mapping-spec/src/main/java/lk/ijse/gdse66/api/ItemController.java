package lk.ijse.gdse66.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String SaveItemJson(){
        return "SaveItemJson(): I accept only application/Json";
    }

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public String SaveItemXml(){
        return "SaveItemXml(): I accept only application/xml";
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String SaveItemMultipartFormData(){
        return "SaveItemMultipartFormData(): I accept only multipart/form-data";
    }

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String SaveItemUrlEncoded(){
        return "SaveItemUrlEncoded(): I accept only application/x-www-form-urlencoded";
    }

//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public String GetItemAsJson(){
//        return "GetItemAsJson()";
//    }

//    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public String GetItemASXml(){
//        return "GetItemsAsXml()";
//    }

    @GetMapping(headers = {"content-type=application/json","accept=application/xml"})
    public String getItemAsXML(){
        return "GetItemAsXML";
    }


}
