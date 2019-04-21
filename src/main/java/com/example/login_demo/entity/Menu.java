package com.example.login_demo.entity;

public class Menu {
    /**
     * 菜单功能id
     */
    private Integer id;
    /**
     * 功能菜单名称
     */
    private String name;
    /**
     * 父次啊单id
     */
    private Integer pid;
    /**
     * 排序
     */
    private Integer order;
    /**
     * 当前状态
     */
    private String state;
    /**
     * 单签类型，file，package
     */
    private String type;

    public Menu(Integer id, int pid, String type, String name, String state, int order) {
        this.id=id;
        this.pid=pid;
        this.type=type;
        this.name=name;
        this.state=state;
        this.order=order;
    }

    public Menu() {
        
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", order=" + order +
                ", state='" + state + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
