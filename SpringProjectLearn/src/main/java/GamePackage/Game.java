package GamePackage;


import org.springframework.stereotype.Component;

@Component
public interface Game {
    public void Run();
    public void Left();
    public void Right();
    public void Up();
    public void Down();

}
