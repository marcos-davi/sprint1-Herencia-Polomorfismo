package exercise1;

public class WindInstrument extends Instrument {
    String name = "Saxophone";
    int price = 1500;

    // methode play implemented
    @Override
    public void play() {
        System.out.println("Està sonant un instrument de vent");

    }
}
