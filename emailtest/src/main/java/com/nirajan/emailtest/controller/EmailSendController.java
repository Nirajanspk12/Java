package com.nirajan.emailtest.controller;

import com.nirajan.emailtest.dto.EmailRequestDto;
import com.nirajan.emailtest.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class EmailSendController {
    private final EmailService emailService;

    @PostMapping("/email")
    public ResponseEntity<?>emailSend(@RequestBody EmailRequestDto emailRequestDto){
        return new ResponseEntity<>(emailService.sendEmailWithoutBody(emailRequestDto), HttpStatus.ACCEPTED);
    }

}
