package com.lcwd.User.exception;

import com.lcwd.User.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResorceNotFoundException(ResourceNotFoundException exception){
        String mssg=exception.getMessage();
        ApiResponse response= ApiResponse.builder().message(mssg).success(true).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
    }
}
