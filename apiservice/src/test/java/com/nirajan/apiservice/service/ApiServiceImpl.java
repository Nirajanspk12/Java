package com.nirajan.apiservice.service;

import com.nirajan.apiservice.dto.MyObject;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

public class ApiServiceImpl implements ApiService {
    @Override
    @Scheduled(initialDelay = 1000, fixedDelay = 10000000)
    public void doSomething() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://63206886e3bdd81d8ef9a524.mockapi.io/api/v1/dqw";
        ResponseEntity<MyObject[]> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                MyObject[].class
        );
        if (response.getStatusCode().is2xxSuccessful()){
        MyObject[] objects= response.getBody();
        for (MyObject obj:objects){
                System.out.println(obj.toString());
            }
        }
        else{
            System.out.println("Request failed with status code" + response.getStatusCode());
        }
    }
}

