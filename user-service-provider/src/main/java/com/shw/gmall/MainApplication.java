package com.shw.gmall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author shw
 * @date 2020/12/29 21:53
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("provider.xml");
        classPathXmlApplicationContext.start();

        System.in.read();

    }

}
