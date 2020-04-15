package com.heavent.spring;

import com.heavent.spring.dao.Department;
import com.heavent.spring.dao.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Title 程序入口
 * @Description spring ioc容器的简单使用
 *              示范如果通过多种读取方式注入bean
 * @Author Heavent
 * @Date 2020-03-28
 * @Version 1.0.0
 **/
public class ApplicatoinMain {

    public static void main(String[] args) {

        System.out.println("-------------------- 通过xml配置的方式管理 ------------------------");
        // 类编译目录下读取xml文件
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) app.getBean("heavent");
        System.out.println(user.toString());

        // 指定某个磁盘路径下读取xml文件
        ApplicationContext app2 = new FileSystemXmlApplicationContext("C:\\Users\\Heavent\\Desktop\\github\\sample\\spring\\chapter01\\src\\main\\resources\\beans.xml");
        Department department = (Department) app.getBean("department");
        System.out.println(department.toString());

    }

}
