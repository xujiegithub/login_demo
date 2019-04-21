package com.example.login_demo.entity;

import java.util.Date;

public class User {

    /** 账户*/
    private String account;
    /** 密码*/
    private String password;
    /** 姓名*/
    private String name;
    /** 固定电话*/
    private String office_telephone;
    /** 手机*/
    private String hand_telephone;
    /** */
    private Integer pwd_min_len;
    /** 账户*/
    private String ord;
    /** 账户*/
    private String visit_host;
    /** 密码更新时间*/
    private Date pwd_valid_date;
    /** 密码更新日期*/
    private Integer pwd_valid_days;
    /** 主机访问锁*/
    private Integer lock_visit_host;
    /** 域名*/
    private String deptname;
    /** 账户*/
    private String functionids;
    /** 公司id*/
    private Integer corp_id;
    /** 是否使用*/
    private Integer is_stop;

    private String note;

    private String date_greate;

    private String gh;


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffice_telephone() {
        return office_telephone;
    }

    public void setOffice_telephone(String office_telephone) {
        this.office_telephone = office_telephone;
    }

    public String getHand_telephone() {
        return hand_telephone;
    }

    public void setHand_telephone(String hand_telephone) {
        this.hand_telephone = hand_telephone;
    }

    public Integer getPwd_min_len() {
        return pwd_min_len;
    }

    public void setPwd_min_len(Integer pwd_min_len) {
        this.pwd_min_len = pwd_min_len;
    }

    public String getOrd() {
        return ord;
    }

    public void setOrd(String ord) {
        this.ord = ord;
    }

    public String getVisit_host() {
        return visit_host;
    }

    public void setVisit_host(String visit_host) {
        this.visit_host = visit_host;
    }

    public Date getPwd_valid_date() {
        return pwd_valid_date;
    }

    public void setPwd_valid_date(Date pwd_valid_date) {
        this.pwd_valid_date = pwd_valid_date;
    }

    public Integer getPwd_valid_days() {
        return pwd_valid_days;
    }

    public void setPwd_valid_days(Integer pwd_valid_days) {
        this.pwd_valid_days = pwd_valid_days;
    }

    public Integer getLock_visit_host() {
        return lock_visit_host;
    }

    public void setLock_visit_host(Integer lock_visit_host) {
        this.lock_visit_host = lock_visit_host;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getFunctionids() {
        return functionids;
    }

    public void setFunctionids(String functionids) {
        this.functionids = functionids;
    }

    public Integer getCorp_id() {
        return corp_id;
    }

    public void setCorp_id(Integer corp_id) {
        this.corp_id = corp_id;
    }

    public Integer getIs_stop() {
        return is_stop;
    }

    public void setIs_stop(Integer is_stop) {
        this.is_stop = is_stop;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDate_greate() {
        return date_greate;
    }

    public void setDate_greate(String date_greate) {
        this.date_greate = date_greate;
    }

    public String getGh() {
        return gh;
    }

    public void setGh(String gh) {
        this.gh = gh;
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", office_telephone='" + office_telephone + '\'' +
                ", hand_telephone='" + hand_telephone + '\'' +
                ", pwd_min_len=" + pwd_min_len +
                ", ord='" + ord + '\'' +
                ", visit_host='" + visit_host + '\'' +
                ", pwd_valid_date=" + pwd_valid_date +
                ", pwd_valid_days=" + pwd_valid_days +
                ", lock_visit_host=" + lock_visit_host +
                ", deptname='" + deptname + '\'' +
                ", functionids='" + functionids + '\'' +
                ", corp_id=" + corp_id +
                ", is_stop=" + is_stop +
                ", note='" + note + '\'' +
                ", date_greate='" + date_greate + '\'' +
                ", gh='" + gh + '\'' +
                '}';
    }
}

