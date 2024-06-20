package com.example_Spring.SpringProjectLearn;
import GamePackage.*;

import GamePackage1.GameRunner02;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp01 {

    public static void main(String[] args){
        Game obj_ref = new MarioGame();

        ApplicationContext context =
                new AnnotationConfigApplicationContext(BasicJavaConfiguration.class);
        context.getBean(GameRunner02.class).Run();
    }
}

