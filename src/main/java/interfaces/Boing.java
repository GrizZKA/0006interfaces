package interfaces;

public class Boing implements Fly {
    public void name() {
        System.out.println("Name: Boing");
    }

    public void speed() {
        System.out.println("Speed (m/h): 1500");
    }

    public void weight() {
        System.out.println("Weight (kg): 5000");
    }

    public void countPassangers() {
        System.out.println("Number of passangers: 200");
    }

    public void securityLevel() {
        System.out.println("Security level: High");
    }
}
