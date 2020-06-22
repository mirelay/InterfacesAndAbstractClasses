package InterfacesChallenge;

public class Airplane extends Vehicle implements IFly {

    public void fly() {
        System.out.println("The airplane is flying");
    }

    public void takeOff() {
        System.out.println("The airplane is taking off");
    }

    @Override
    public void move() {
        this.fly();
    }
}
