package com.nirajan.emailtest.service;

import com.nirajan.emailtest.dto.EmailRequestDto;

public interface EmailService {
    String sendEmailWithoutBody(EmailRequestDto emailRequestDto);
    String sendEmailWithBody(EmailRequestDto emailRequestDto);
}
