package com.blb.Impl;

import com.blb.Dao.UserDao;
import com.blb.entity.Student;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private List<Student> l;

    public List<Student> getL() {
        return l;
    }
    public void setL(List<Student> l) {
        this.l = l;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say(){
        System.out.println("hollow spring");
       for(Student s  :l){
           System.out.println(s.getAge()+" "+s.getName());
       }
    }
    public void init(){
        System.out.println("正在执行init方法");
    }
    public void dsetory(){
        System.out.println("正在执行destory方法");
    }


}
