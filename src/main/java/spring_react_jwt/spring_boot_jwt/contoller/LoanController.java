package spring_react_jwt.spring_boot_jwt.contoller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/loan")
public class LoanController {
    @GetMapping("/get-my-loan")
     public String getMyLoan(){
        return "Here Your Loan";
    }
}
