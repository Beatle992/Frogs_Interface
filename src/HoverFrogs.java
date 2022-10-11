public class HoverFrogs extends Frog implements IHelicopter {

    protected String name;
    protected int height;
    protected String color;

    public HoverFrogs(int height, String name, String color) {
        super(height, name, color); }


    public void makeSound(){

        System.out.println("HoverFrogs do Quaak too!!");
    }


    public void hover() {
        System.out.println("HoverFrog: "+ name + "starting to hover"); }
    public void takeoff() {
        System.out.println("Taking off...");
    }

    public void takeOffVerticaly() {
        System.out.println("taking  off vertically...");
    }


    public void getAltitude() {
        System.out.println("getting altitude...");
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
