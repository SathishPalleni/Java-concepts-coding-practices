
 interface  Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

public class Pig implements Animal {
    public void animalSound() {
        System.out.println("the pig says: wee  wee");
    }
    public void sleep(){
        System.out.println("pig is sleeping ");
    }
    public String toString() {
        return "This is a Pig object";
    }
}
class main {
    public static void main (String [] args){
        Animal pg = new Pig();
        pg.animalSound();
        pg.sleep();
        //System.out.println(pg);
    }
}
