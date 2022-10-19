public class Jet_Pilot extends Tower_Control implements Aircraft{


    protected String name;
    protected int birthDate;
    protected String subSpecies;
    private int altitude = 0;


    public Jet_Pilot(int birthDate, String name, String subSpecies) {
        super(birthDate, name, subSpecies);
    }


    public void makeSound(){

        System.out.println("Jet_Pilot says: I'm John, a Jet Pilot!!");
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


    public void takeoff() {
        altitude = 1000;
        System.out.println("Taking off..." + altitude + " feet");
    }
    public void getAltitude() {
        System.out.println("getting altitude... " + altitude);
    }

    public void land() {
        System.out.println("in approach to land");
    }


}
