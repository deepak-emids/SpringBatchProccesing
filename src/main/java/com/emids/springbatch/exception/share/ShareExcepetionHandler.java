package com.emids.springbatch.exception.share;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ShareExcepetionHandler {

    @ExceptionHandler(value = ShareNotFoundException.class)
    public ResponseEntity<String> shareNotFoundExceptionHandler(ShareNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = InvalidFieldNameException.class)
    public ResponseEntity<String> InvalidFieldNameExceptionHandler(InvalidFieldNameException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
