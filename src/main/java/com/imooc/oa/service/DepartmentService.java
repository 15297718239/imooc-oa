package com.imooc.oa.service;

import com.imooc.oa.entity.Department;
import com.imooc.oa.mapper.DepartmentMapper;
import com.imooc.oa.utils.MybatisUtils;

public class DepartmentService {
    public Department selectById(Long departmentId){
        return (Department)MybatisUtils.executeQuery(sqlSession -> sqlSession.getMapper(DepartmentMapper.class).selectById(departmentId));
    }
}
