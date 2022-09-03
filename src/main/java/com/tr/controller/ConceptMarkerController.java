package com.tr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ConceptMarkerController {
    @GetMapping
   public String hello(){
       System.out.println("This is concept marker");
       return "this is concept marker service";
    }
}
