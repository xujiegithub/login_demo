package com.example.login_demo.dao;

import com.example.login_demo.entity.Dict;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DictMapper {

    List<Dict> dictList(int id);
}
