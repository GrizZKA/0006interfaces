package interfaces;

public class MainAirport {
    public static void main(String[] args) {
        Boing boing = new Boing();
        Kukurudza kukurudza = new Kukurudza();
        System.out.println("Specification airplane SV347:");
        boing.name();
        boing.speed();
        boing.weight();
        boing.countPassangers();
        boing.securityLevel();
        System.out.println();
        System.out.println("Specification airplane KK15:");
        kukurudza.name();
        kukurudza.speed();
        kukurudza.weight();
        kukurudza.countPassangers();
        kukurudza.securityLevel();
    }
}
