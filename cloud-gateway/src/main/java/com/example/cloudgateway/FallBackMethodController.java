package com.example.cloudgateway;


import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String  userServiceFallBackMethod(){
        return "User Service is taking longer than Expected. "+
                "Please try again later";
    }

    @PostMapping("/userServicePostFallBack")
    public String  userServicePostFallBackMethod(){
        return "User Service is taking longer than Expected. "+
                "Please try again later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String  departmentServiceFallBackMethod(){
        return "Department Service is taking longer than Expected. "+
                "Please try again later";
    }

    @PostMapping("/departmentServicePostFallBack")
    public String  departmentServicePostFallBackMethod(){
        return "Department Service is taking longer than Expected. "+
                "Please try again later";
    }

}
