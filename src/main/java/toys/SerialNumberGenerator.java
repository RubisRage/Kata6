package toys;

public class SerialNumberGenerator {
    private Integer serialNumber = 0;

    public Integer next(){
        return serialNumber++;
    }
}
