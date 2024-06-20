package GamePackage;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class PowerPuffGirls implements Game{
    public void Run(){
        System.out.println("PowerPuffGirls is Running");
        this.Left();
        this.Right();
        this.Up();
        this.Down();
    }

    public void Left(){
        System.out.println("PowerPuffGirls is going Left");
    }

    public void Right(){
        System.out.println("PowerPuffGirls is going Right");
    }

    public void Up(){
        System.out.println("PowerPuffGirls is going Up");
    }

    public void Down(){
        System.out.println("PowerPuffGirls is going Down");
    }


}
