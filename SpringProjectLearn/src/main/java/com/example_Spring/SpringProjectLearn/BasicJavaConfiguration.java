package com.example_Spring.SpringProjectLearn;
import GamePackage.Game;
import GamePackage1.*;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasicJavaConfiguration {
    @Bean
    public PowerPuffGirls01 Game1(){
        return new PowerPuffGirls01();
    }


    @Bean
    public MarioGame01 Game2(){
        return new MarioGame01();

    }
    @Bean
    public GameRunner02 GameRun(Game Game2){
        return new GameRunner02 (Game2);
    }


}