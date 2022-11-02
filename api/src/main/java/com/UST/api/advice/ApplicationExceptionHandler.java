package com.UST.api.advice;



import java.util.HashMap;
import java.util.Map;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;



import com.UST.api.exception.UserNotFoundException;



@RestControllerAdvice



public class ApplicationExceptionHandler {
    
    
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(UserNotFoundException.class)
    public Map<String,String>handleBusinessException(UserNotFoundException ex)
    {
        Map<String,String> errormap=new HashMap<>();
        errormap.put("errormessage", ex.getMessage());
        return errormap;
        
    }
    
}