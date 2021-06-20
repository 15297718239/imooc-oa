package com.imooc.oa.mapper;

import com.imooc.oa.entity.Notice;

import java.util.List;

public interface NoticeMapper {
    public void insert(Notice notice);

    public List<Notice> selectByReceiverId(Long receiverId);
}
