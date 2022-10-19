public abstract class Inhabitans_of_Earth {


        protected String name;
        protected int birthDate;
        protected String subSpecies;

        public Inhabitans_of_Earth(int birthDate, String name, String subSpecies)
        {
            this.subSpecies = subSpecies;
            this.birthDate = birthDate;
            this.name = name;

            System.out.println(name);

            System.out.println(name +" I am ready");
        }

        public int getBirthDate(){
            return birthDate;
        }
        public String getSubSpecies(){
            return subSpecies;
        }

        public String getName(){return name; }

        public abstract void makeSound();
}
