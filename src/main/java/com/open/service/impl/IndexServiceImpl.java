package com.open.service.impl;

import com.open.mapper.IndexMapper;
import com.open.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Tang on 2018/4/15.
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    IndexMapper indexMapper;

    public int queryCount(){

        int count = indexMapper.getCount();
        return count;

    }
}
