package com.minhhung.Bookstore.Exceptions;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
class ErrorModel{
    private String message;
    private String path;
}

@ControllerAdvice
@ConditionalOnProperty(prefix = "app", name = "disable-default-exception-handling")
class GlobalControllerExceptionHandler {

    public ResponseEntity<ErrorModel> handleException(NotFoundException ex, ServletWebRequest request) {
        return new ResponseEntity<>(new ErrorModel(ex.getMessage(), request.getRequest().getRequestURI()), HttpStatus.NOT_FOUND);
    }
}