package com.example.demo;

import aj.org.objectweb.asm.TypeReference;
import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;
import com.example.demo.service.AccountService;
import com.example.demo.service.AccountServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

//    public static void main(String[] args) throws JsonProcessingException {
//        RestTemplate restTemplate = new RestTemplate();
//        String fooResourceUrl
//                = "https://6289b2b1e5e5a9ad321bfaab.mockapi.io/Account";// link fake data ở mockapi
//        ResponseEntity<String> response
//                = restTemplate.getForEntity(fooResourceUrl, String.class);
//        List<String> rs = Collections.singletonList(response.getBody());
//        ObjectMapper mapper = new ObjectMapper();
//        List<Account> accounts = Arrays.asList(mapper.readValue(response.getBody(), Account[].class));
//        for (Account acc : accounts) {
//            System.out.println(acc);
//        }
////        Demo2Application demo2Application = new Demo2Application();
//
//        accountService1.saveAccounts(accounts);
//    }
}
