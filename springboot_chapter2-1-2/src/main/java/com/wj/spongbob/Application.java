package com.wj.spongbob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Application.class, args);

        Binder binder = Binder.get(context.getEnvironment());

        //绑定简单配置
        Person person = binder.bind("com.spongbob", Bindable.of(Person.class)).get();
        System.out.println(person.getName());

        //绑定List配置
        List<String> list = binder.bind("com.wj.spongbob.list", Bindable.listOf(String.class)).get();
        System.out.println(list);

        List<Blog> blogs = binder.bind("com.wj.spongbob.blog", Bindable.listOf(Blog.class)).get();
        System.out.println(blogs);

        //读取配置
        System.out.println(context.getEnvironment().containsProperty("com.spongbob.database-platform"));
        System.out.println(context.getEnvironment().containsProperty("com.spongbob.databasePlatform"));

    }

}
