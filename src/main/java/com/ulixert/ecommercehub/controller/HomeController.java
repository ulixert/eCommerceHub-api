package com.ulixert.ecommercehub.controller;

import com.ulixert.ecommercehub.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public ApiResponse HomeControllerHandler() {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Welcome to Ecommerce Hub");
        return apiResponse;
    }
}
