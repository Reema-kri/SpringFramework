package com.example_Spring.SpringProjectLearn;
import GamePackage.*;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasicJavaConfiguration {
    @Bean
    public  PowerPuffGirls Game1(){
        return new PowerPuffGirls();

    }

    @Bean
    public MarioGame Game2(){
        return new MarioGame();

    }
    @Bean
    public GameRunner GameConsole(Game Game2){
        return new GameRunner(Game2);
    }

}