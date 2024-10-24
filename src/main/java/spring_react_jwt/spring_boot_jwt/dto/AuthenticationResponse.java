package spring_react_jwt.spring_boot_jwt.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class AuthenticationResponse {
    private final String jwt;

    public AuthenticationResponse(String jwt){
        this.jwt=jwt;
    }

    public String getJwt(){
        return  jwt;
    }
}
