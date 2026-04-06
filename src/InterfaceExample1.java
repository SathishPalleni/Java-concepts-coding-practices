
interface FirstInterface {
    public void myMethod();
}
interface SecondInterface {
    public void myOtherMethod();
}
class Democlass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("frist method inn interface ");
    }
    public void myOtherMethod(){
        System.out.println("second methosd in interface ");
    }
}


public class InterfaceExample1 {
    public static void main (String [] args){
        Democlass myclass = new Democlass();
        myclass.myMethod();
        myclass.myOtherMethod();
    }
}
