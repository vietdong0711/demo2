package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.swing.text.html.parser.Entity;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@CrossOrigin
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping(value = "account")
    public ResponseEntity<?> getAndSaveListAccount() throws JsonProcessingException {

        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "https://6289b2b1e5e5a9ad321bfaab.mockapi.io/Account";// link fake data ở mockapi
        ResponseEntity<String> response
                = restTemplate.getForEntity(fooResourceUrl, String.class);
        List<String> rs = Collections.singletonList(response.getBody());
        ObjectMapper mapper = new ObjectMapper();
        List<Account> accounts = Arrays.asList(mapper.readValue(response.getBody(), Account[].class));
        for (Account acc : accounts) {
            System.out.println(acc);
        }

        accountService.saveAccounts(accounts);

        return new ResponseEntity<>("luu thanh cong", HttpStatus.OK);
    }
}
