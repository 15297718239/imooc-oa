package com.imooc.oa.service;

import com.imooc.oa.entity.Node;
import com.imooc.oa.mapper.RbacMapper;

import java.util.List;

public class RbacService {
    private RbacMapper rbacMapper = new RbacMapper();
    public List<Node> selectNodeByUserId(Long userId){
        return rbacMapper.selectNodeByUserId(userId);
    }
}
