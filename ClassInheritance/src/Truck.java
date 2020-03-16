public class Truck extends MotorVehicle {
    private int maximumLoadThatItCanPull;

    public Truck(int maximumLoadThatItCanPull, String mark, String model, String color, double length, double width, double height, Engine engine) {
        super(mark, model, color, length, width, height, engine);
        this.maximumLoadThatItCanPull = maximumLoadThatItCanPull;
    }

    public int getMaximumLoadThatItCanPull() {
        return maximumLoadThatItCanPull;
    }

    public void setMaximumLoadThatItCanPull(int maximumLoadThatItCanPull) {
        this.maximumLoadThatItCanPull = maximumLoadThatItCanPull;
    }
}
