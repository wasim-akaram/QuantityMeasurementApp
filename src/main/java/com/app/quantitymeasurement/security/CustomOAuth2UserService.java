package com.app.quantitymeasurement.security;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import com.app.quantitymeasurement.model.User;
import com.app.quantitymeasurement.repository.UserRepository;

@Service
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JwtUtil jwtUtil;
  
    @Override
    public OAuth2User loadUser(OAuth2UserRequest request) throws OAuth2AuthenticationException {

        System.out.println("🔥 CustomOAuth2UserService CALLED");

        OAuth2User user = super.loadUser(request);

        Map<String, Object> attributes = user.getAttributes();

        String name = (String) attributes.get("name");
        String email = (String) attributes.get("email");

        System.out.println("Google User: " + name + " " + email);

        userRepository.findByEmail(email)
        .orElseGet(() -> {
            User newUser = new User();
            newUser.setName(name);
            newUser.setEmail(email);

            // 🔥 OAuth users don't have password
            newUser.setPassword("GOOGLE_USER");  

            newUser.setPhoneNumber(null);

            return userRepository.save(newUser);
        });

       
        System.out.println("jwtUtil object: " + jwtUtil);

        String token = jwtUtil.generateToken(email);
        System.out.println("JWT TOKEN: " + token);

        return user;
    }
}