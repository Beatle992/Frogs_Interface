public class Frog extends Amphibium{

    public Frog(int height, String name, String color) {
        super(height, name, color);
    }

    public void makeSound(){

        System.out.println("Frogs do Quaak!!");
    }

    public void towerControl() {
        System.out.println("\033[3mSituation: HoverFrog to Frog conversation\033[0m");

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

    protected void instrucToClimb(HoverFrogs hoverFrog){
        System.out.println("Frog to "+hoverFrog.getName() +": Climb 1000 feet");
        hoverFrog.climb();
    }

    protected void instrucToDescend(HoverFrogs hoverFrog){
        System.out.println("Frog to "+hoverFrog.getName() +": Descend 1000 feet");
        hoverFrog.descend();
    }

}

