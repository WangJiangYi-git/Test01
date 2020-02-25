package com.bdqn.service.impl;

import com.bdqn.entity.Test;
import com.bdqn.mapper.TestMapper;
import com.bdqn.response.Result;
import com.bdqn.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public Result getList() {
        Map<String,String>map=new HashMap<>();
        map.put("name","kkk");
        map.put("age","18");
        return new Result(true,1000,"",map);
    }

    @Override
    public Result add(Test test) {
        int row = this.testMapper.insert(test);

        if(row>0) return new Result(true,1000,"添加成功!");
        else return new Result(false,999,"添加失败!");
    }
}
