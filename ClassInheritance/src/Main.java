public class Main {
    public static void main(String args[]) {


        Car audi = new Car(52, 4, "WAb", "Dg", "red", 35, 36, 2, new Engine(1, 2, 4, "bgdg"));
        Truck n = new Truck(34, "VFV", "FD", "blue", 54, 2, 2, new Engine(4, 5, 5, "tgg"));
        System.out.println(audi.mark);
        System.out.println(n.length);
        System.out.println(n.engine.getHorsePower());

    }
}
