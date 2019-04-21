package com.example.login_demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.login_demo.entity.Menu;
import com.example.login_demo.service.MenuService;
import com.example.login_demo.util.ReturnResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**author:许洁
 * 业务包管理
 */
@Controller
@RequestMapping("/package")
public class MenuController {

    @Autowired
    private MenuService menuService;

    //业务包维护业务包获取
    @RequestMapping("/show")
    @ResponseBody
    public Object SelectByPid(HttpSession session, HttpServletRequest request) {

        int pid = Integer.parseInt(request.getParameter("pId"));
        List<Menu> list = menuService.SelectAllByPid(pid);
//        ArrayList<Menu> list = new ArrayList<>();
//       list.add(menu);
        return JSON.toJSON(ReturnResult.success(true, "操作成功", list));
    }

    //新增业务包
    @RequestMapping("/add")
    @ResponseBody
    public Object AddMenu(String type, String name, String state, int order, HttpServletRequest request) {
        int pid = 0;
        if (request.getParameter("pId") == null) {
            pid = 0;
        } else {
            pid = Integer.parseInt(request.getParameter("pId"));
        }
        Integer id = menuService.getMaxId() + 1;
        Menu menu = new Menu(id, pid, type, name, state, order);
        menuService.AddMenu(menu);
        ArrayList<Menu> list = new ArrayList<>();
        Menu menu1 = new Menu();
        list.add(menu1);
        return JSON.toJSONString((ReturnResult.success(true, "添加成功", list)), SerializerFeature.WriteDateUseDateFormat);
    }

    //修改业务包
    @RequestMapping("/save")
    @ResponseBody
    public Object SaveMenu(int id, String name, String state, int order, HttpServletRequest request) {
        HttpSession session = request.getSession();
        menuService.SaveMenu(id, name, state, order);
        ArrayList<Menu> list = new ArrayList<>();
        Menu menu = new Menu();
        list.add(menu);
        return JSON.toJSONString((ReturnResult.success(true, "修改成功", list)), SerializerFeature.WriteDateUseDateFormat);
    }

    //删除业务包
    @ResponseBody
    @RequestMapping("/delete")
    public Object DeletePackage(int id) {
        menuService.DeleteMunu(id);
        ArrayList<Menu> list = new ArrayList<>();
        Menu menu = new Menu();
        list.add(menu);
        return JSON.toJSONString((ReturnResult.success(true, "删除成功", list)), SerializerFeature.WriteDateUseDateFormat);
    }

    //获取子项
    @ResponseBody
    @RequestMapping("/showItem")
    public Object ShowItem(int pId, String type) {
        int pid = pId;
        System.out.println(pid);
        List<Menu> list = menuService.SelectByPidType(pid, type);
        return JSON.toJSON(ReturnResult.success(true, " ", list));
    }

    //添加子项
    @ResponseBody
    @RequestMapping("/addItem")
    public Object addItem(Integer pId, String type, String name, String state,
                          @RequestParam(defaultValue = "0", required = false)
            Integer order) {
        Integer id = menuService.getMaxId() + 1;
        menuService.addItem(id,pId, type, name, state, order);
        ArrayList<Menu> list = new ArrayList<>();
        Menu menu = new Menu();
        list.add(menu);
        return JSON.toJSONString((ReturnResult.success(true, "新建成功", list)), SerializerFeature.WriteDateUseDateFormat);
    }

    //修改业务包
    @RequestMapping("/saveItem")
    @ResponseBody
    public Object SaveItem(int id, String name, String state) {
//        Menu menu=new Menu();
        menuService.SaveMenu(id, name, state);
        ArrayList<Menu> list = new ArrayList<>();
        Menu menu = new Menu();
        list.add(menu);
        return JSON.toJSONString((ReturnResult.success(true, "修改成功", list)), SerializerFeature.WriteDateUseDateFormat);
    }

    //删除子项
    @RequestMapping("/deleteItem")
    @ResponseBody
    public Object deleteItem(int id) {
        menuService.deleteItem(id);
        ArrayList<Menu> list = new ArrayList<>();
        Menu menu = new Menu();
        list.add(menu);
        return JSON.toJSONString((ReturnResult.success(true, "删除成功", list)), SerializerFeature.WriteDateUseDateFormat);
    }

    //移动排序
    @RequestMapping("/move")
    @ResponseBody
    public Object MoveItem(HttpServletRequest request, int id, int order) {

        menuService.moveItem(id, order);

        ArrayList<Menu> list = new ArrayList<>();
        Menu menu = menuService.SelectByPid(id);
        ;
        list.add(menu);
        return JSON.toJSON(ReturnResult.success(true, " ", list));
    }

    @RequestMapping("maxid")
    @ResponseBody
    public Object maxid() {
        int id = menuService.getMaxId();
        return id;
    }
}

