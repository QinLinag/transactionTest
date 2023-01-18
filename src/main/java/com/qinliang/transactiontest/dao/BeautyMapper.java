package com.qinliang.transactiontest.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qinliang.transactiontest.entity.Beauty;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BeautyMapper extends BaseMapper<Beauty> {
}
