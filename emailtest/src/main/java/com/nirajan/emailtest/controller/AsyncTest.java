package com.nirajan.emailtest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/async")
@RequiredArgsConstructor
public class AsyncTest {
private final AsyncService asyncService;

@GetMapping("/test")
    public String checl(){
    return asyncService.dosomething();
}
}
