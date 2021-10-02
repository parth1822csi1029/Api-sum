package com.example.apisum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {
    @GetMapping("/sum")
    public int sum(@RequestParam String input){
        String arr[]= input.split(" ");
        int a = 0;
        for(int i=0; i< arr.length; i++){
            a+= Integer.parseInt(arr[i]);
        }
        return a;

    }
}
