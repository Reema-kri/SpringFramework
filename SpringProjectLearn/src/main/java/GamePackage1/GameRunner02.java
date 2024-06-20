package GamePackage1;

import GamePackage.Game;

public class GameRunner02 {

    Game game;

    public GameRunner02(Game gameRef){
        this.game = gameRef;

    }
    public void Run(){
        this.game.Run();

    }
}
