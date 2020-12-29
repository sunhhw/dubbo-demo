package com.shw.gmall.service.impl;

import com.shw.gmall.pojo.UserAddress;
import com.shw.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @author shw
 * @date 2020/12/28 23:03
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress = new UserAddress(1, "安徽", "1", "李老师", "1231231231", "1");
        UserAddress userAddress2 = new UserAddress(2, "安徽2", "2", "李老师2", "122222231", "2");

        return Arrays.asList(userAddress,userAddress2);
    }
}
