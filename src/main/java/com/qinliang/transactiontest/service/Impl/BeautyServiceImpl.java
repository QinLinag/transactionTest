package com.qinliang.transactiontest.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinliang.transactiontest.dao.BeautyMapper;
import com.qinliang.transactiontest.entity.Beauty;
import com.qinliang.transactiontest.service.BeautyService;
import org.springframework.stereotype.Service;


@Service
public class BeautyServiceImpl extends ServiceImpl<BeautyMapper,Beauty> implements BeautyService {

}
