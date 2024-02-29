package com.nirajan.emailtest.service;

import com.nirajan.emailtest.dto.EmailRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService{
private final JavaMailSender javaMailSender;

@Value("${spring.mail.username}")
private String sender;
    @Override
    public String sendEmailWithoutBody(EmailRequestDto emailRequestDto) {
        try{
            SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
            simpleMailMessage.setFrom(sender);
            simpleMailMessage.setTo(emailRequestDto.getReceipent());
            simpleMailMessage.setSubject(emailRequestDto.getSubject());
            simpleMailMessage.setText(emailRequestDto.getBody());
            javaMailSender.send(simpleMailMessage);
            return "Mail sent sucessfully";
        }catch (Exception e){
            return "Error in sending Mail.";
        }
    }

    @Override
    public String sendEmailWithBody(EmailRequestDto emailRequestDto) {
        return null;
    }
}
