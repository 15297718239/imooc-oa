package com.imooc.oa.service;

import com.imooc.oa.entity.Notice;
import com.imooc.oa.mapper.NoticeMapper;
import com.imooc.oa.utils.MybatisUtils;

import java.util.List;

public class NoticeService {
    public List<Notice> getNoticeList(Long receiverId){
        return (List)MybatisUtils.executeQuery(sqlSession -> {
            NoticeMapper mapper = sqlSession.getMapper(NoticeMapper.class);
            return mapper.selectByReceiverId(receiverId);
        });
    }
}
