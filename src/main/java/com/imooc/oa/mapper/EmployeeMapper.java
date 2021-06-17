package com.imooc.oa.mapper;

import com.imooc.oa.entity.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    public Employee selectById(Long employeeId);
    public List<Employee> selectByParams(Map params);
}
