package com.imooc.oa.mapper;

import com.imooc.oa.entity.ProcessFlow;
import com.imooc.oa.utils.MybatisUtils;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class ProcessFlowMapperTest {

    @Test
    public void insert() {
        MybatisUtils.executeUpdate(sqlSession -> {
            ProcessFlowMapper mapper = sqlSession.getMapper(ProcessFlowMapper.class);
            ProcessFlow processFlow = new ProcessFlow();
            processFlow.setFormId(3l);
            processFlow.setOperatorId(2l);
            processFlow.setAction("audit");
            processFlow.setResult("approved");
            processFlow.setReason("同意");
            processFlow.setCreateTime(new Date());
            processFlow.setAuditTime(new Date());
            processFlow.setOrderNo(1);
            processFlow.setState("ready");
            processFlow.setIsLast(1);
            mapper.insert(processFlow);
            return null;
        });
    }
}