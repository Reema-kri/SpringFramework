package Rest_Api_All_Methods;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")
public class Rest_API_Controller_Class {

    @RequestMapping("/HelloPage")
    public String showHello(){
        return "HELLO EVERYONE";
    }

    @RequestMapping("/Vendor")
    public CloudVendor ShowVendorDetail(){
        return new CloudVendor(1,"Abhay","RAJASTHAN");

    }


}
