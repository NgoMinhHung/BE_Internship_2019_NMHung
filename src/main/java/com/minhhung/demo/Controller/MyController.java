package com.minhhung.demo.Controller;

import com.minhhung.demo.Model.MyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyModel model;

    @RequestMapping(value = "/HelloWorld", method = RequestMethod.GET)
    public String sayHello(){
        model.setName("hello world");
        return model.toString();
    }
}
