package GamePackage;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements Game{
    public void Run(){
        System.out.println("Mario is Running");
        this.Left();
        this.Right();
        this.Up();
        this.Down();
    }

    public void Left(){
        System.out.println("Mario is gping Left");
    }

    public void Right(){
        System.out.println("Mario is going Right");
    }

    public void Up(){
        System.out.println("Mario is going Up");
    }

    public void Down(){
        System.out.println("Mario is going Down");
    }

}
