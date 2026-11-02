package nivel2;

public class Smartphone extends Phone implements Clock, Camera{
    @Override
    public void takePicture() {
        System.out.println("Taking a picture");

    }
    public void alarmSounds() {
        System.out.println("Alarm sounds");

    }
}
