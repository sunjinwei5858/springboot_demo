package com.sunjinwei.domain;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * @program: com.sunjinwei.domain
 * @author: sun jinwei
 * @create: 2022-10-09 07:05
 * @description:
 **/
public class UserDTO {

    @ExcelProperty(value = "年龄", index = 0)
    private int age;

    @ExcelProperty(value = "姓名", index = 1)
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}