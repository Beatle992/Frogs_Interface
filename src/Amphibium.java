public abstract class Amphibium {


        protected String name;
        protected int height;
        protected String color;

        public Amphibium(int height, String name, String color)
        {
            this.color = color;
            this.height = height;
            this.name = name;

            System.out.println(name);

            System.out.println(name +" I am ready to take off");
        }

        public int getHeight(){
            return height;
        }
        public String getColor(){
            return color;
        }
        public String getName(){return name; }

        public abstract void makeSound();
}
