package com.nirajan.apiservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class ApiController {
    public final ApiService apiService;

@GetMapping("/get-api")
public String getApi(){
    apiService.doSomething();
    return "Sucess";
}
}
