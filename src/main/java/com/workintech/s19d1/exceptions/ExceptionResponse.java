package com.workintech.s19d1.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;


@AllArgsConstructor
@Data
public class ExceptionResponse {

    private String message;
    private int status;
    private LocalDateTime dateTime;

}
