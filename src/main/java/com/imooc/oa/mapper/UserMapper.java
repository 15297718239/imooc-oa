package com.imooc.oa.mapper;

import com.imooc.oa.entity.User;
import com.imooc.oa.utils.MybatisUtils;

public class UserMapper {
    public User selectByUsername(String username){
        User user = (User)MybatisUtils.executeQuery(sqlSession -> sqlSession.selectOne("usermapper.selectByUsername", username));
        return user;
    }
}
