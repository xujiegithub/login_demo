package com.example.login_demo.service;

import com.example.login_demo.entity.Menu;

import java.util.List;

public interface MenuService {

    Menu SelectByPid(int pId);

    List<Menu> SelectAllByPid(int pId);

    void AddMenu(Menu menu);

    void SaveMenu(int id, String name, String state, int order);

    void DeleteMunu(int id);

    List<Menu> SelectByPidType(int pid, String type);

    void addItem(int id, int pId, String type, String name, String state, int order);

    void SaveMenu(int id, String name, String state);

    void deleteItem(int id);

    void moveItem(int id, int order);

    Integer getMaxId();
}
