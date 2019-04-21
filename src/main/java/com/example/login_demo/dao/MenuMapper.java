package com.example.login_demo.dao;

import com.example.login_demo.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuMapper {

    Menu SelectByPid(int pId);

    void AddMenu(Menu menu);

    void SaveMenu(@Param("id") int id, @Param("name") String name,
                  @Param("state") String state, @Param("order") int order);

    void DeleteMunu(int id);

    List<Menu> SelectByPidType(@Param("pid") int pid, @Param("type") String type);

    void addItem(@Param("id") int id, @Param("pid") int pId, @Param("type") String type, @Param("name") String name, @Param("state") String state, @Param("order") int order);

    void SaveItem(int id, String name, String state);

    void deleteItem(int id);

    void moveItem(@Param("id") int id, @Param("order") int order);

    List<Menu> SelectAllByPid(int pId);

    Integer getMaxId();
}
