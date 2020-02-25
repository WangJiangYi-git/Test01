package com.bdqn.service;

import com.bdqn.entity.Test;
import com.bdqn.response.Result;

public interface TestService {
    Result getList();

    Result add(Test test);
}
