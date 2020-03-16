public class Car extends MotorVehicle {
    private int trunkLoad;
    private int numberOfPassangers;


    public Car(int trunkLoad, int numberOfPassangers, String mark, String model, String color, double length, double width, double height, Engine engine) {
        super(mark, model, color, length, width, height, engine);
        this.numberOfPassangers = numberOfPassangers;
        this.trunkLoad = trunkLoad;
    }


    public int getTrunkLoad() {
        return trunkLoad;
    }

    public void setTrunkLoad(int trunkLoad) {
        this.trunkLoad = trunkLoad;
    }

    public int getNumberOfPassangers() {
        return numberOfPassangers;
    }

    public void setNumberOfPassangers(int numberOfPassangers) {
        this.numberOfPassangers = numberOfPassangers;
    }
}
