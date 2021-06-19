package com.imooc.oa.mapper;

import com.imooc.oa.entity.LeaveForm;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface LeaveFormMapper {
    public void insert(LeaveForm form);
    /*
        map.put("pf_operator_id" , xxxx)
        map.put("pf_state" , xxxx)
     */
    public List<Map> selectByParams(@Param("pf_state") String pfState
            , @Param("pf_operator_id") Long pfOperatorId);

    public void update(LeaveForm form);

    public LeaveForm selectById(Long formId);
}
