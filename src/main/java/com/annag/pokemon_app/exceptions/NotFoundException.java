package com.annag.pokemon_app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends Exception{

    @Serial
    private static final long serialVersionUID = 1L;

    public NotFoundException(String message){
        super(message);
    }
}
