package toys;

public class Car {
    private final Integer serialNumber;
    private final String type;

    public Car(Integer serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void pack(){
        System.out.printf("Packing: Type=%s , ID=%d\n", type, serialNumber);
    }

    public void label(){
        System.out.printf("Labeling: Type=%s , ID=%d\n", type, serialNumber);
    }
}
