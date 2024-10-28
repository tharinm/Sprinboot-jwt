package spring_react_jwt.spring_boot_jwt.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/auth")
public class AuthController {

  @GetMapping("user")
    public String getAccountDetails(){
      return "Here Your Account";
  }

}
