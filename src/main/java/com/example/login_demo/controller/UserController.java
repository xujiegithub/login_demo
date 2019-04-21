package com.example.login_demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.login_demo.dao.UserMapper;
import com.example.login_demo.entity.User;
import com.example.login_demo.util.JsonDateValueProcessor;
import com.example.login_demo.util.ReturnResult;
import net.sf.json.JsonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/index")
    String userIndex() {
        return "index";
    }

    //用户登陆
    @RequestMapping("/login_ui")
    public ModelAndView loginUi(ModelAndView modelAndView) {
        modelAndView.setViewName("/user/login");
        //resources/templates/login
        return modelAndView;
    }

    @RequestMapping("/register_ui")
    public ModelAndView registerUi(ModelAndView modelAndView) {
        modelAndView.setViewName("register");
        return modelAndView;
    }

    //用户登陆
    @RequestMapping("/login")
    @ResponseBody
    public Object login(HttpServletResponse req, HttpServletRequest request) {
        User user1 = new User();
        user1.setAccount(request.getParameter("account"));
        user1.setPassword(request.getParameter("password"));
        User u = userMapper.login(user1);

        if (u != null) {
            ArrayList<User> list = new ArrayList<>();
            list.add(u);
            JsonConfig jsonConfig = new JsonConfig();
            jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
            net.sf.json.JSONArray jsonArray = net.sf.json.JSONArray.fromObject(list, jsonConfig);
            return JSON.toJSON(ReturnResult.success(true, "登陆成功", jsonArray));
        } else {
            ArrayList<User> list = new ArrayList<>();
            User user = new User();
            list.add(user);
            return JSON.toJSONString((ReturnResult.error("用户名或密码错误", list)), SerializerFeature.WriteDateUseDateFormat);
        }
    }

    //用户注册
    @RequestMapping("/register")
    public Object register(HttpServletRequest request) {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        ModelAndView mv = new ModelAndView();
        User user = new User();
////        user.setId(userMapper.getMaxId()+1);
        user.setName(name);
        user.setPassword(password);
        boolean flag = userMapper.addUser(user);
        mv.setViewName("redirect:/login_ui");
        return mv;
        /*if(flag){
            System.out.println("已添加");
            mv.setViewName("show");
            //  return mv;
            return "success";
        }else{
            System.out.println("添加失败");
            mv.setViewName("error");
            //  return mv;
            return  "error";
        }*/
    }
//    @ResponseBody
//    @RequestMapping("/changePwd")
//    public Object changePwd(String account,String   pwd_old, String pwd_new){
//        User user1 = new User();
//        user1.setAccount(account);
//        user1.setPassword(pwd_old);
//        User u = userMapper.login(user1);
//        if(u!=null){
//            userMapper.changePwd(account,pwd_old,pwd_new);
//        }
//        return null;
//    }
}
