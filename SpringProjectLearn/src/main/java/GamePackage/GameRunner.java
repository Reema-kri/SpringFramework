
package GamePackage;
public class GameRunner {
    Game game;

    public GameRunner(Game gameRef){
        this.game = gameRef;

    }
    public void Run(){
        this.game.Run();
        this.game.Left();
        this.game.Right();
        this.game.Up();
        this.game.Down();

    }
}
