package com.xjl.crm.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xjl.crm.mapper.UserMapper;
import com.xjl.crm.page.PageBean;
import com.xjl.crm.resp.UserResp;
import com.xjl.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2018/8/23.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserResp> listUser() {
        return userMapper.listUser();
    }

    @Override
    public PageInfo<UserResp> listUser(Integer pageNum, Integer PageSize) {
        PageHelper.startPage(pageNum,PageSize);
        List<UserResp> list = userMapper.listUser();
        return new PageInfo<UserResp>(list);
    }
}
