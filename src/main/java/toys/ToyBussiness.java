package toys;

public class ToyBussiness {
    private final SerialNumberGenerator generator = new SerialNumberGenerator();

    public Car createCar(){
        Car tmp = new Car(generator.next(), "Car");
        tmp.pack();
        tmp.label();

        return tmp;
    }

    public Helicopter createHelicopter(){
        Helicopter tmp = new Helicopter(generator.next(), "Helicopter");
        tmp.pack();
        tmp.label();

        return tmp;
    }
}
