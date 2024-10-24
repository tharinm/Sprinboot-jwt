package spring_react_jwt.spring_boot_jwt.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthenicationRequest {
    private String username;
    private String password;
}

