package com.shw.gmall;

import com.shw.gmall.service.OrderService;
import com.shw.gmall.service.impl.OrderServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author shw
 * @date 2020/12/29 22:02
 */
public class ConsumerApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("comsumer.xml");

        OrderService bean = applicationContext.getBean(OrderService.class);

        bean.initOrder("1");

        int read = System.in.read();
        System.out.println("结束...");

    }

}
