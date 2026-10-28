public class StringInstrument extends Instrument {
    String name = "Viola";
    int price = 800;

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de corda");

    }
}
