public class Toads extends Amphibium {


        protected String name;
        protected int height;
        protected String color;

        public Toads(int height, String name, String color) {
            super(height, name, color);
        }

        public void makeSound(){
            System.out.println("Toads do Quoork");
        }



    }

