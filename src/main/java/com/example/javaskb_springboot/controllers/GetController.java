package com.example.javaskb_springboot.controllers;

import com.example.javaskb_springboot.dto.UserOut;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;


@Controller
public class GetController {

    @GetMapping("/user/{userName}/{age}/{gender}")
    public ResponseEntity<UserOut> getMethod(@PathVariable String userName, @PathVariable Integer age, @PathVariable String gender){
        return new ResponseEntity<>(new UserOut(userName, age, gender), HttpStatus.OK);
    }

    @GetMapping("/user")
    public String httpHeadersMethod(Model mod, @RequestHeader Map headers) {
        StringBuffer str = new StringBuffer("");

        headers.forEach((key, value) -> {
            str.append(String.format(" %s: %s \n", key, value));
        });

        mod.addAttribute("headers", str);
        return "temp";
    }
}
