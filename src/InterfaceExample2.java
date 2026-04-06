import java.io.*;
interface Vehicle {
    //abstract method
    void changeFear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class Bicycle implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeFear(int newGear){
        gear = newGear;
    }
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }
    @Override
    public void applyBrakes(int decrement) {
        speed = speed + decrement;
    }
    public void printstates() {
        System.out.println("speed" + speed + "gear" + gear);
    }
}
class Bike implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeFear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed+increment;

    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed + decrement;
    }
    public void printstates(){
        System.out.println("speed" + speed + "gear"+ gear);
    }
}

public class InterfaceExample2 {
    public static void main(String [] args){
        // instace of Bicycle
        Bicycle bicycle = new Bicycle();
        bicycle.changeFear(2);
        bicycle.applyBrakes(3);
        bicycle.speedUp(4);
        System.out.println("Bicycle present state");
        bicycle.printstates();

        // instace of Bike
        Bike bike = new Bike();
        bike.applyBrakes(2);
        bike.changeFear(3);
        bike.speedUp(3);
        System.out.println("Bike object crearing");
        bike.printstates();

    }
}
