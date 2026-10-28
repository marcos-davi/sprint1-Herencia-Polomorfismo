public class WindInstrument extends Instrument {
    String name = "Saxophone";
    int price = 1500;

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de vent");

    }
}
