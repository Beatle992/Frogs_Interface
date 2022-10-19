public class Main {
    public static void main(String[] args) {

                System.out.println("-------------------------------------------------------");

                Bird sparrow = new Bird(1 , "Bird", "Sparrow");
                sparrow.makeSound();
                System.out.println(sparrow.getSubSpecies());
                System.out.println(sparrow.getBirthDate());

                System.out.println("-------------------------------------------------------");

                Helicopter_Pilot Jack = new Helicopter_Pilot(33, "Jack, Helicopter Pilot", "Human");
                Jack.makeSound();

                System.out.println(Jack.getSubSpecies());

                System.out.println(Jack.getBirthDate());

                System.out.println("-------------------------------------------------------");

                Jet_Pilot John = new Jet_Pilot(50, "John, Jet Pilot", "Human");
                John.makeSound();

                System.out.println(John.getSubSpecies());

                System.out.println(John.getBirthDate());

                System.out.println("-------------------------------------------------------");



                Tower_Control controller = new Tower_Control(12, "Tower_Control" , "Human" );
                controller.makeSound();
                System.out.println(controller.getSubSpecies());
                System.out.println(controller.getBirthDate());

                System.out.println("-------------------------------------------------------");

                controller.towerControl();

                System.out.println();
                System.out.println();

                controller.requestAltitude(Jack);

                System.out.println();

                controller.instructHover(Jack);

                System.out.println();

                controller.instructHoveringInPlace(Jack);

                System.out.println();

                controller.instructToLand(Jack);

                System.out.println();

                controller.instructToLandVertically(Jack);

                System.out.println();

                controller.instructTakeOff(Jack);

                System.out.println();

                controller.takeOffVerticaly(Jack);

                System.out.println();

                controller.instrucToClimb(Jack);

                System.out.println();

                controller.instrucToDescend(Jack);

                System.out.println("-------------------------------------------------------");

                controller.requestAltitude(John);

                System.out.println();

                controller.instructToLand(John);

                System.out.println();

                controller.instructTakeOff(John);

                System.out.println();

                controller.instrucToClimb(John);

                System.out.println();

                controller.instrucToDescend(John);




    }


        }