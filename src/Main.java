public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------");

                HoverFrogs hover = new HoverFrogs(33, "HoverFrog", "green");
                hover.makeSound();
                System.out.println(hover.getColor());
                System.out.println(hover.getHeight());

                System.out.println("-------------------------------------------------------");

                Frog frog = new Frog(12, "Frog" , "green" );
                frog.makeSound();
                System.out.println(frog.getColor());
                System.out.println(frog.getHeight());

                System.out.println("-------------------------------------------------------");

                frog.towercontrol();
                System.out.println();
                System.out.println();

                frog.requestAltitude(hover);

                System.out.println();

                frog.instructHover(hover);

                System.out.println();

                frog.instructHoveringInPlace(hover);

                System.out.println();

                frog.instructToLand(hover);

                System.out.println();

                frog.instructToLandVertically(hover);

                System.out.println();

                frog.instructTakeOff(hover);

                System.out.println();

                frog.takeOffVerticaly(hover);


            }
        }