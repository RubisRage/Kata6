package toys;

public class Car {
    private final Integer serialNumber;

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void pack(){
        System.out.printf("Packing: %d\n", serialNumber);
    }

    public void label(){
        System.out.printf("Labeling: %d\n", serialNumber);
    }
}
