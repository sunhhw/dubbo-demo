package com.shw.gmall.service;

import com.shw.gmall.pojo.UserAddress;

import java.util.List;

/**
 * @author shw
 * @date 2020/12/28 23:03
 */
public interface UserService {

    public List<UserAddress> getUserAddressList(String userId);

}
