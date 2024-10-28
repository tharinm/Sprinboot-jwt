package spring_react_jwt.spring_boot_jwt.contoller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/notice")
public class NoticeController {

    @GetMapping("/get-my-notice")
    public String myNotice(){
        return "Here Your Notice";
    }
}
