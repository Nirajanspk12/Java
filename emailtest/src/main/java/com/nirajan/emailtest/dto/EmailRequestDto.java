package com.nirajan.emailtest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmailRequestDto {
    private String receipent;
    private String subject;
    private String attachment;
    private String body;
}
