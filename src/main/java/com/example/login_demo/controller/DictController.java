package com.example.login_demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.login_demo.entity.Dict;
import com.example.login_demo.service.DictService;
import com.example.login_demo.util.ReturnResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * author:许洁
 * 数据字典
 */
@Controller
@RequestMapping("/dictionary")
public class DictController {
    @Autowired
    private DictService dictService;

    @RequestMapping("/list")
    @ResponseBody
    private Object dictList(int parent_id){
        List<Dict> dict=dictService.dictList(parent_id);


        return JSON.toJSON(ReturnResult.success(true, " ", dict));

    }
}
