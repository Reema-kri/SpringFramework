
package GamePackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    @Autowired
    Game game;

    public GameRunner(Game gameRef){
        this.game = gameRef;

    }
    public void Run(){
        this.game.Run();


    }
}
