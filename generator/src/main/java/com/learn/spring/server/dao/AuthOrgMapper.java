package com.learn.spring.server.dao;

import com.learn.spring.server.model.AuthOrg;

public interface AuthOrgMapper {
    int insert(AuthOrg record);

    int insertSelective(AuthOrg record);
}