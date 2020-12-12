public class Main {
    public static void main(String[] args) {
        Monkey monkey0 = new Monkey("Гита", 20, "джунгли", 120);
        monkey0.printInfo();
        System.out.println("    ");

        Monkey monkey1 = new Monkey("Зита", 10, "джунгли", 50);
        monkey1.HomeAnimal();
        monkey1.printInfo();
        System.out.println("    ");

        Dog dog1 = new Dog("Джек",40, "трава у дома", 100 );
        dog1.printInfo();
        System.out.println("    ");

        Dolphin dog2 = new Dolphin ("Чаки",1000, "вода", 300 );
        dog2.setTypeofeat("мелкая рыба");
        dog2.printInfo();
        System.out.println("    ");

        Sparrow sparrow1 = new Sparrow ("Ронни",1.2 );
        sparrow1.printInfo();
        System.out.println("    ");

        Sparrow sparrow2 = new Sparrow("Гарри", 0.4);
        sparrow2.homeSparrow();
        System.out.println("     ");

           }
}

class Animal {
    String name;
    double weight;
    String habitat;
    int height;

    public Animal(String name) {
    }


    public Animal(String name, double weight, String habitat, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.habitat = habitat;

    }
    public Animal(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
           }

    public double getWeight() {
          return  weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }
    public void HomeAnimal () {
        setHabitat("домашнее животное");
    }
}




