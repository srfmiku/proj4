package com.proj4.blog.controller;

import com.proj4.blog.dao.pojo.SysUser;
import com.proj4.blog.utils.UserThreadLocal;
import com.proj4.blog.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping
    public Result test(){
        SysUser sysUser = UserThreadLocal.get();
        System.out.println(sysUser);
        return Result.success(null);
    }
}
