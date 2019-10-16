package com.novafutur.financial.configuration.exception;

import org.jooq.tools.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ObjectNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(ObjectNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String objctNotFoundHandler(ObjectNotFoundException ex) {

        JSONObject out = new JSONObject();
        out.put("errorCode",1000);
        out.put("errorMessage",ex.getMessage());
        out.put("id",ex.getId());
        out.put("type",ex.getType());

        return out.toString();
    }

}
