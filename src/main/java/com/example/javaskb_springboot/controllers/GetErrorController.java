package com.example.javaskb_springboot.controllers;

import com.example.javaskb_springboot.dto.Info;
import com.example.javaskb_springboot.dto.Product;
import com.example.javaskb_springboot.errors.CustomException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController

public class GetErrorController {

    @RequestMapping(value = "/error/")
    public String testCustomControllerAdvice() throws CustomException {
        throw new CustomException();
    }
}
