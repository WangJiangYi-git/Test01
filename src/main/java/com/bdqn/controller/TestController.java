package com.bdqn.controller;

import com.bdqn.entity.Test;
import com.bdqn.response.Result;
import com.bdqn.service.TestService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private TestService testService;

    @PostMapping("/list")
    public Result getList(){
        return this.testService.getList();
    }

    @PostMapping("/name/{name}")
    public Result getPostName(@PathVariable("name")String name){
        return new Result(true,1000,name,null);
    }

    @GetMapping("/name/{name}")
    public Result getName(@PathVariable("name")String name){
        return new Result(true,1000,name,null);
    }

    @PostMapping("/add")
    public Result add(@RequestBody Test test){
        return this.testService.add(test);
    }
}
