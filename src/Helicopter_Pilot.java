public class Helicopter_Pilot extends Tower_Control implements IHelicopter{

    //HoverFrogs

    protected String name;
    protected int birthDate;
    protected String subSpecies;
    private int altitude = 0;

    public Helicopter_Pilot(int birthDate, String name, String subSpecies) {
        super(birthDate, name, subSpecies); }


    public void makeSound(){

        System.out.println("Helicopter_Pilot says: I'm Jack, a Helicopter Pilot!!");
    }


    public void climb(){
        altitude += 1000;
        getAltitude();
    }

    public void descend() {
        if (altitude == 0) {
            return;
        }
        altitude -= 1000;
        getAltitude();
    }

    public void hover() {
        System.out.println("HelicopterPilot: "+ name + "starting to hover");
    }

    public void takeoff() {
        altitude = 1000;
        System.out.println("Taking off..." + altitude + " feet");
    }

    public void takeOffVerticaly() {
        System.out.println("taking  off vertically...");
    }

    public void getAltitude() {
        System.out.println("getting altitude... " + altitude);
    }

    public void hoverInPlace() {
        System.out.println("position reached, hovering in progress");
    }

    public void land() {
        System.out.println("in approach to land");
    }

    public void landVertically() {
        System.out.println("vertical landing...");
    }

}
