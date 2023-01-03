package com.kubernetes.hellokubernetes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangtenglong no 2023/1/2 .
 */
@RestController
public class HelloKubernetes {

    @RequestMapping("/hello")
    public String hello(String name){
        System.out.println("hello "+name);
        return "success";
    }
}
