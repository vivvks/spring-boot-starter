package com.viv.springstarterproject;

import model.PlainPojo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/monitor")
    public String sayHello(){
        PlainPojo pj= new PlainPojo();
        System.out.println("db_url=="+pj.getDbURL());
        return "pj.getDbURL()";
    }
}
