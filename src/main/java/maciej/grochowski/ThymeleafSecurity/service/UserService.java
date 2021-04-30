package maciej.grochowski.ThymeleafSecurity.service;

import maciej.grochowski.ThymeleafSecurity.User;
import maciej.grochowski.ThymeleafSecurity.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);


}
