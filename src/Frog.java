public class Frog extends Amphibium{


    public Frog(int height, String name, String color) {
        super(height, name, color);
    }

    public void makeSound(){

        System.out.println("Quaak!!");
    }


    protected void instructTakeOff(HoverFrogs hoverFrog) {
        System.out.println("Frog to " + hoverFrog.getName() + ": Cleared for take off!");
        hoverFrog.takeoff();
    }

    protected void takeOffVerticaly(HoverFrogs hoverFrog) {
        System.out.println("Frog to " + hoverFrog.getName() + ": Cleared for vertically take off!");
        hoverFrog.takeOffVerticaly();
    }

    protected void requestAltitude(HoverFrogs hoverFrog) {
        System.out.println("Frog to " + hoverFrog.getName() + ": Requesting Altitude!");
        hoverFrog.getAltitude();
    }

    protected void instructHover(HoverFrogs hoverFrog) {
        System.out.println("Frog to " + hoverFrog.getName() + ": Cleared for hovering!");
        hoverFrog.hover();
    }

    protected void instructHoveringInPlace(HoverFrogs hoverFrog) {
        System.out.println("Frog to " + hoverFrog.getName() + ": Cleared for hovering in place!");
        hoverFrog.hoverInPlace();
    }



    protected void instructToLandVertically(HoverFrogs hoverFrog) {
        System.out.println("Frog to " + hoverFrog.getName() + ": Cleared for vertically landing!");
        hoverFrog.landVertically();
    }


    protected void instructToLand(HoverFrogs hoverFrog) {
        System.out.println("Frog to " + hoverFrog.getName() + ": Cleared for landing!");
        hoverFrog.land();
    }



}

