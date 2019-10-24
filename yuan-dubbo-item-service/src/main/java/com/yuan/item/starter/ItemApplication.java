package com.yuan.item.starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemApplication {

	public static void main(String[] args) throws Exception {
		/**
		 * 使用dubbo官网提供的运行方式之一：main方法运行
		 * 启动加载配置文件spring-context.xml。该文件中导入了项目所有相关的xml配置文件
		 * 注意：这种启动方式的缺点在于dubbo相关的高级特性是使用不了的。
		 * 推荐方式：本工程的pom文件中<build>标签被注释的部分，可达到与springboot工程“类似”的效果
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"classpath:spring/spring-context.xml"});
        context.start();
        System.in.read();
	}

}
