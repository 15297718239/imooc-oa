package com.imooc.oa.mapper;

import com.imooc.oa.entity.ProcessFlow;

import java.util.List;

public interface ProcessFlowMapper {
    public void insert(ProcessFlow processFlow);
    public void update(ProcessFlow processFlow);
    public List<ProcessFlow> selectByFormId(Long formId);
}
