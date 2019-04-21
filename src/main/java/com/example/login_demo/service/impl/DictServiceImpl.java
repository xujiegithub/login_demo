package com.example.login_demo.service.impl;

import com.example.login_demo.dao.DictMapper;
import com.example.login_demo.entity.Dict;
import com.example.login_demo.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictServiceImpl implements DictService {

    @Autowired
    private DictMapper dictMapper;
    @Override
    public List<Dict> dictList(int id) {
        return dictMapper.dictList(id);
    }
}
