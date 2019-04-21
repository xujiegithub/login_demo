package com.example.login_demo.service.impl;

import com.example.login_demo.dao.MenuMapper;
import com.example.login_demo.entity.Menu;
import com.example.login_demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public Menu SelectByPid(int pId) {
        Menu menu = menuMapper.SelectByPid(pId);

        return menu;
    }

    @Override
    public List<Menu> SelectAllByPid(int pId) {

        return menuMapper.SelectAllByPid(pId);
    }

    @Override
    public void AddMenu(Menu menu) {
        System.out.println(menu.toString());
        menuMapper.AddMenu(menu);
    }

    @Override
    public void SaveMenu(int id, String name, String state, int order) {
        menuMapper.SaveMenu(id, name, state, order);
    }

    @Override
    public void DeleteMunu(int id) {
        menuMapper.DeleteMunu(id);
    }

    @Override
    public List<Menu> SelectByPidType(int pid, String type) {
        return menuMapper.SelectByPidType(pid, type);
    }

    @Override
    public void addItem(int id,int pId, String type, String name, String state, int order) {
        menuMapper.addItem(id,pId, type, name, state, order);
    }

    @Override
    public void SaveMenu(int id, String name, String state) {
        menuMapper.SaveItem(id, name, state);
    }

    @Override
    public void deleteItem(int id) {
        menuMapper.deleteItem(id);
    }

    @Override
    public void moveItem(int id, int order) {
        menuMapper.moveItem(id, order);
    }


    @Override
    public Integer getMaxId() {
        return menuMapper.getMaxId();
    }


}
