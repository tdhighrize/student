package org.dhbw.service.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
* HelloController
*/
@RestController
public class HelloController {

 @GetMapping("/hello")
 public String sayHello() {
 return "Hallo Welt!";
 }

}