package com.sunjinwei.controller;

import com.sunjinwei.domain.User;
import com.sunjinwei.domain.UserDTO;
import com.sunjinwei.utils.ExcelUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: com.sunjinwei.controller
 * @author: sun jinwei
 * @create: 2022-09-18 17:56
 * @description:
 **/
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("export")
    public void export(@RequestBody User user, HttpServletResponse response) throws Exception {

        List<UserDTO> users = new ArrayList<>();
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        users.add(userDTO);

        try {
            ExcelUtils.exportEasyExcel(response, "用户表", "user", UserDTO.class, users);
        } catch (Exception e) {
            throw e;
        }

    }


}