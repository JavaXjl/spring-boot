package com.xjl.crm.service;

import com.github.pagehelper.PageInfo;
import com.xjl.crm.page.PageBean;
import com.xjl.crm.resp.UserResp;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2018/8/23.
 */
@Service
public interface UserService {

    List<UserResp> listUser();

    PageInfo<UserResp> listUser(Integer pageNum, Integer PageSize);
}
