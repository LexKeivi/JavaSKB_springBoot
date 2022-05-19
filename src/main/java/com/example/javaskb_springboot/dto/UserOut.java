package com.example.javaskb_springboot.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOut {
    public String userName;
    public Integer age;
    public String gender;
}
