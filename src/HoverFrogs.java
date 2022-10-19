public class HoverFrogs extends Frog implements IHelicopter{

    protected String name;
    protected int height;
    protected String color;
    private int altitute = 0;

    public HoverFrogs(int height, String name, String color) {
        super(height, name, color); }


    public void makeSound(){

        System.out.println("HoverFrogs do Quaak too!!");
    }


    public void climb(){
        altitute += 1000;
        getAltitude();
    }

    public void descend() {
        if (altitute == 0) {
            return;
        }
        altitute -= 1000;
        getAltitude();
    }

    public void hover() {
        System.out.println("HoverFrog: "+ name + "starting to hover");
    }

    public void takeoff() {
        altitute = 1000;
        System.out.println("Taking off..." + altitute + " feet");
    }

    public void takeOffVerticaly() {
        System.out.println("taking  off vertically...");
    }

    public void getAltitude() {
        System.out.println("getting altitude... " + altitute);
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
