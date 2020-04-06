package com.aoher.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("Spring-Bean.xml");
        
        Employee employee1 = (Employee) beanFactory.getBean("employeeConstructorBean");
        System.out.println("employee1 id: " + employee1.getEmployeeId());
        System.out.println("employee1 name: " + employee1.getEmployeeName());

        System.out.println("--- --- ---");

        Employee employee2 = (Employee) beanFactory.getBean("employeeGetterBean");
        System.out.println("employee2 id: " + employee2.getEmployeeId());
        System.out.println("employee2 name: " + employee2.getEmployeeName());
    }
}
