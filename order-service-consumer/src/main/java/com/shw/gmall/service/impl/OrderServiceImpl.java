package com.shw.gmall.service.impl;

import com.shw.gmall.pojo.UserAddress;
import com.shw.gmall.service.OrderService;
import com.shw.gmall.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shw
 * @date 2020/12/28 23:10
 * <p>
 * 1.将服务提供者注册到注册中心
 * 1) 导入dubbo依赖2.6.2，操作zookeeper的客户端 curator
 * 2) 配置服务提供者
 * 2.让服务消费者去注册中心订阅服务提供者的服务地址
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public void initOrder(String userId) {
        // 1.查询用户的收获地址
        System.out.println("userID:" + userId);
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : userAddressList) {
            System.out.println(userAddress);
        }

    }

}
