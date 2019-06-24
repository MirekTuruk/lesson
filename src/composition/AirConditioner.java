package composition;

public class AirConditioner {
    private String refNumber;
    private String model;
    private int power;
    private int NoiseLevel;

    public AirConditioner(String refNumber, String model, int power, int noiseLevel) {
        this.refNumber = refNumber;
        this.model = model;
        this.power = power;
        NoiseLevel = noiseLevel;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNoiseLevel() {
        return NoiseLevel;
    }

    public void setNoiseLevel(int noiseLevel) {
        NoiseLevel = noiseLevel;
    }

    @Override
    public String toString() {
        return refNumber;
    }
}
