package com.camp.hospital.Exception;

import com.camp.hospital.model.ApiError;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityNotFoundException;

import java.util.NoSuchElementException;

import static org.springframework.beans.factory.config.YamlProcessor.MatchStatus.NOT_FOUND;

//@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class exception{

    //other exception handlers

    @ExceptionHandler(value = EntityNotFoundException.class)
    protected ResponseEntity<ApiError> handleEntityNotFound(
            EntityNotFoundException ex, WebRequest webRequest) {
        ApiError apiError = new ApiError(HttpStatus.UNAUTHORIZED,ex.getMessage());
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
}
