public class Tower_Control extends Inhabitans_of_Earth {

    //Frog

    public Tower_Control(int birthDate, String name, String subSpecies) {
        super(birthDate, name, subSpecies);
    }



    public void makeSound(){

        System.out.println("Tower says: Ready to command...");
    }

    public void towerControl() {
        System.out.println("\033[3mSituation: TowerControl to Helicopter Pilot and Jet Pilot, command exchange...\033[0m");

    }


    protected void instructTakeOff(Helicopter_Pilot Jack) {
        System.out.println("TowerControl to " + Jack.getName() + ": Cleared for take off!");
        Jack.takeoff();
    }

    protected void takeOffVerticaly(Helicopter_Pilot Jack) {
        System.out.println("TowerControl to " + Jack.getName() + ": Cleared for vertically take off!");
        Jack.takeOffVerticaly();
    }

    protected void requestAltitude(Helicopter_Pilot Jack) {
        System.out.println("TowerControl to " + Jack.getName() + ": Requesting Altitude!");
        Jack.getAltitude();
    }

    protected void instructHover(Helicopter_Pilot Jack) {
        System.out.println("TowerControl to " + Jack.getName() + ": Cleared for hovering!");
        Jack.hover();
    }

    protected void instructHoveringInPlace(Helicopter_Pilot Jack) {
        System.out.println("TowerControl to " + Jack.getName() + ": Cleared for hovering in place!");
        Jack.hoverInPlace();
    }



    protected void instructToLandVertically(Helicopter_Pilot hoverFrog) {
        System.out.println("TowerControl to " + hoverFrog.getName() + ": Cleared for vertically landing!");
        hoverFrog.landVertically();
    }


    protected void instructToLand(Helicopter_Pilot hoverFrog) {
        System.out.println("TowerControl to " + hoverFrog.getName() + ": Cleared for landing!");
        hoverFrog.land();
    }

    protected void instrucToClimb(Helicopter_Pilot hoverFrog){
        System.out.println("TowerControl to "+hoverFrog.getName() +": Climb 1000 feet");
        hoverFrog.climb();
    }

    protected void instrucToDescend(Helicopter_Pilot hoverFrog){
        System.out.println("TowerControl to "+hoverFrog.getName() +": Descend 1000 feet");
        hoverFrog.descend();
    }

    //JetPilot//

    protected void instrucToClimb(Jet_Pilot hoverFrog){
        System.out.println("TowerControl to "+hoverFrog.getName() +": Climb 1000 feet");
        hoverFrog.climb();
    }

    protected void instrucToDescend(Jet_Pilot hoverFrog){
        System.out.println("TowerControl to "+hoverFrog.getName() +": Descend 1000 feet");
        hoverFrog.descend();
    }

    protected void instructToLand(Jet_Pilot hoverFrog) {
        System.out.println("TowerControl to " + hoverFrog.getName() + ": Cleared for landing!");
        hoverFrog.land();
    }

    protected void requestAltitude(Jet_Pilot Jack) {
        System.out.println("TowerControl to " + Jack.getName() + ": Requesting Altitude!");
        Jack.getAltitude();
    }


    protected void instructTakeOff(Jet_Pilot Jack) {
        System.out.println("TowerControl to " + Jack.getName() + ": Cleared for take off!");
        Jack.takeoff();
    }




}

