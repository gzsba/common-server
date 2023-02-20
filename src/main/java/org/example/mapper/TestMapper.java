package org.example.mapper;

import org.example.model.UserInfo;
import org.springframework.context.annotation.Bean;


public interface TestMapper {
    public int insert(UserInfo info);
}
