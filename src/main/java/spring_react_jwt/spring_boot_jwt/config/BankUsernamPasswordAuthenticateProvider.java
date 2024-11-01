package spring_react_jwt.spring_boot_jwt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import spring_react_jwt.spring_boot_jwt.entity.User;
import spring_react_jwt.spring_boot_jwt.repository.UserRepo;

import java.util.ArrayList;
import java.util.List;

@Component
public class BankUsernamPasswordAuthenticateProvider implements AuthenticationProvider {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username=authentication.getName();
        String password=authentication.getCredentials().toString();

        List< User> user=userRepo.findByEmail(username);
        if(user.size()>0){
            if(passwordEncoder.matches(password,user.get(0).getPassword())){
                List <GrantedAuthority>  authorities=new ArrayList<>();
                authorities.add(new SimpleGrantedAuthority(user.get(0).getRole()));
                return  new UsernamePasswordAuthenticationToken(username,password,authorities);
            }
            else{
                throw  new BadCredentialsException(("Inavalid password"));
            }
        }
        else{
            throw new BadCredentialsException("No user registered with  this details");
        }

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
