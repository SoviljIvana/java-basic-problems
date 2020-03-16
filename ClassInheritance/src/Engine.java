public class Engine {
    private int weight;
    private int horsePower;
    private int consumption;
    private String model;

    public Engine(int weight, int horsePower, int consumption, String model) {
        this.weight = weight;
        this.consumption = consumption;
        this.horsePower = horsePower;
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
