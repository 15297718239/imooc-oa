package com.imooc.oa.mapper;

import com.imooc.oa.entity.Node;
import com.imooc.oa.utils.MybatisUtils;

import java.util.List;

public class RbacMapper {
    public List<Node> selectNodeByUserId(Long userId){
        List list = (List)MybatisUtils.executeQuery(sqlSession -> sqlSession.selectList("rbacmapper.selectNodeByUserId", userId));
        return list;
    }
}
