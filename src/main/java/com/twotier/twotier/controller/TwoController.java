package com.twotier.twotier.controller;

import com.twotier.twotier.model.Msg;
import com.twotier.twotier.service.ServiceMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController {

    @Autowired
    ServiceMsg serviceMsg;


    /*@GetMapping("/test")
    String test()
    {
        System.out.println("Tested sucess");
        return "index";
    }

    @PostMapping("/setMsg")
    String setMsg(@RequestBody Msg msg)
    {
    serviceMsg.setMsg(msg);
    return "index";
    }*/

   @GetMapping("/test")
    public String test() {
        System.out.println("Tested success");
        return "index";
    }

    @PostMapping("/setMsg")
    public String setMsg(@RequestBody Msg msg) {
        serviceMsg.setMsg(msg);
        return "index";
    }



}
