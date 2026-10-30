package nivel1.exercise1;

public class PercussionInstrument extends Instrument{
    String name = "Timbales";
    int price = 700;

    // methode play implemented
    @Override
    public void play() {
        System.out.println("Està sonant un instrument de percussió");

    }
}
