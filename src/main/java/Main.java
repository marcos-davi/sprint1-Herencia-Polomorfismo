public class Main {
    static void main(String[] args) {
        //Create  objects from each subclasses
        PercussionInstrument timbales = new PercussionInstrument();
        StringInstrument viola = new StringInstrument();
        WindInstrument saxophone = new WindInstrument();

        //call the methods play() of the created objects .
        timbales.play();
        saxophone.play();
        viola.play();
    }
}
