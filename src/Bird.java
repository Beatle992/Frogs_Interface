public class Bird extends Inhabitans_of_Earth {

    //Toad


        protected String name;
        protected int birthDate;
        protected String subSpecies;

        public Bird(int birthDate, String name, String subSpecies) {
            super(birthDate, name, subSpecies);
        }

        public void makeSound(){
            System.out.println("Bird does: Cheep Cheep");
        }

    }

