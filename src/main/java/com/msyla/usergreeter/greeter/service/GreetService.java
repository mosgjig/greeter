package com.msyla.usergreeter.greeter.service;

import com.msyla.usergreeter.greeter.dto.UserPreferenceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Service;

@Service
public class GreetService {

    @Autowired
    private OAuth2RestTemplate restTemplate;
    @Value("${user.host.ip}")
    private String userHostIp;

    public String getGreetByUsername(String username) {
        ResponseEntity<UserPreferenceDto[]> responseEntity = restTemplate.getForEntity("http://" + userHostIp + ":8080/api/user/preferences?firstName=" + username, UserPreferenceDto[].class);
        String s = "Hi " + responseEntity.getBody()[0].getFirstName() + ". Your Favourite season is " + responseEntity.getBody()[0].getSeason() + ".";
        return s;
    }
}
