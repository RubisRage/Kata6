package toys;

public class Helicopter {

    private final String type;
    private final Integer serialNumber;

    public Helicopter(Integer serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
    }

    public String getType() {
        return type;
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
