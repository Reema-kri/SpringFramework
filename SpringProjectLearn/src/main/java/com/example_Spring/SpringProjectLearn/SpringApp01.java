package com.example_Spring.SpringProjectLearn;
import GamePackage.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp01 {

    public static void main(String[] args){

        ApplicationContext context =
                new AnnotationConfigApplicationContext(BasicJavaConfiguration.class);
        context.getBean(GameRunner.class).Run();
    }
}

