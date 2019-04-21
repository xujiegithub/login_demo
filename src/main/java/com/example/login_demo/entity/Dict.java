package com.example.login_demo.entity;

public class Dict {

    private Integer id;
    //编码
    private String code;
    //名称
    private String name;
    //父ID
    private Integer parentId;
    //是够封存
    private Integer isSealup;
    //序号
    private Integer ord;
    //说明
    private String note;

    public Dict() {
    }

    public Dict(Integer id, String code, String name, Integer parentId, Integer isSealup, Integer ord, String note) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.parentId = parentId;
        this.isSealup = isSealup;
        this.ord = ord;
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getIsSealup() {
        return isSealup;
    }

    public void setIsSealup(Integer isSealup) {
        this.isSealup = isSealup;
    }

    public Integer getOrd() {
        return ord;
    }

    public void setOrd(Integer ord) {
        this.ord = ord;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Dict{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", isSealup=" + isSealup +
                ", ord=" + ord +
                ", note='" + note + '\'' +
                '}';
    }
}
