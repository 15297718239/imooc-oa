package com.imooc.oa.mapper;

import com.imooc.oa.entity.Employee;

public interface EmployeeMapper {
    public Employee selectById(Long employeeId);
}
