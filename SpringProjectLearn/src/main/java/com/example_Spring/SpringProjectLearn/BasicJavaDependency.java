package com.example_Spring.SpringProjectLearn;
import GamePackage.*;


public class BasicJavaDependency {

    public static void main(String[] args) {
        Game game = new MarioGame();//Object creation for Dependemt class
        GameRunner var = new GameRunner(game);//Object crreation for Main class and
        // Manual Wiring of Dependency(here game is a Dependency)
        try {
            var.Run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
