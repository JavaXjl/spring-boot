package com.xjl.crm.controller;

import com.github.pagehelper.PageInfo;
import com.xjl.crm.page.PageBean;
import com.xjl.crm.resp.Result;
import com.xjl.crm.resp.UserResp;
import com.xjl.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lenovo on 2018/8/23.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    public Result listUser(){
        List<UserResp> list =  userService.listUser();
        return Result.newSuccess(list);
    }

    @RequestMapping(value = "/user/list/page",method = RequestMethod.GET)
    public Result<PageInfo<UserResp>> listUserPage(@RequestParam("pageNumber") Integer pageNumber,
                                                   @RequestParam("pageSize") Integer pageSize){
        PageInfo<UserResp> list =  userService.listUser(pageNumber,pageSize);
        return Result.newSuccess(list);
    }
}
