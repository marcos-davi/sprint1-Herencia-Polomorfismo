package nivel1.exercise1;

public class StringInstrument extends Instrument {
    String name = "Viola";
    int price = 800;

    // methode play implemented
    @Override
    public void play() {
        System.out.println("Està sonant un instrument de corda");

    }
}
