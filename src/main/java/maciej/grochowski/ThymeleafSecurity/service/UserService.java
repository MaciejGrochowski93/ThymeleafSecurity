package maciej.grochowski.ThymeleafSecurity.service;

import maciej.grochowski.ThymeleafSecurity.User;
import maciej.grochowski.ThymeleafSecurity.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);


}
