package spring_react_jwt.spring_boot_jwt.contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import spring_react_jwt.spring_boot_jwt.entity.User;
import spring_react_jwt.spring_boot_jwt.repository.UserRepo;

@RestController
@RequestMapping("api/v1/user-login/")
@CrossOrigin
public class LoginController {




    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user){
        ResponseEntity response= null;
        try{
            String hashPassword=passwordEncoder.encode(user.getPassword());
            user.setPassword(hashPassword);

            User saveUser=userRepo.save(user);
            if(saveUser.getId()>0){
                response=ResponseEntity.status(HttpStatus.CREATED).body("Give User Registered Successfully");
            }
        }
        catch (Exception ex){
            response=ResponseEntity.status(HttpStatus.CREATED).body("An Error Occured"+ ex.getMessage());
        }
        return response;
    }
}
