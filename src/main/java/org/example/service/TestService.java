package org.example.service;

import org.example.mapper.TestMapper;
import org.example.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;
    public int test(UserInfo info){
        int insert = testMapper.insert(info);
        System.out.println("打印结果:"+insert);
        System.out.println(info.toString());
        return 1;
    }
}
