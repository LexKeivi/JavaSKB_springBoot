package com.example.javaskb_springboot.controllers;

import com.example.javaskb_springboot.dto.Info;
import com.example.javaskb_springboot.dto.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@ControllerAdvice
public class PostController {

    @RequestMapping(value = "/product/{id}", method = RequestMethod.POST)
    public Product postMethod(@RequestBody Product product, @PathVariable Integer id) {
        return new Product(125.0, new Info(product.getInfo().getDate(), id));
    }
}
