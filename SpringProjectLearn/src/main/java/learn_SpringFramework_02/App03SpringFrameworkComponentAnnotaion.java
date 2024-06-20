package learn_SpringFramework_02;

import GamePackage.Game;
import GamePackage.GameRunner;
import GamePackage.MarioGame;
import GamePackage.PowerPuffGirls;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan("GamePackage")
//class GamingConfiguration {


//    @Bean
//    public Game game(){
//        Game _game = Game1();
//
//        return _game;
//    }

//    @Bean
//    public MarioGame Game2() {
//        return new MarioGame();
//
//    }
//    @Bean
//    public PowerPuffGirls Game1() {
//        return new PowerPuffGirls();
//
//    }

//    @Bean
//    public GameRunner GameConsole(Game game) {
//        return new GameRunner(game);
//    }
//}

@Configuration
@ComponentScan("GamePackage")
public class App03SpringFrameworkComponentAnnotaion {

        public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext
                (App03SpringFrameworkComponentAnnotaion.class);

        context.getBean(GameRunner.class).Run();

        }
}



