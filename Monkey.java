class Monkey extends Animal {
    String typeofeat;


    public Monkey(String name, double weight, String habitat, int height) {
        super(name, weight, habitat, height);
        this.typeofeat = "бананы";

    }

  /*  public Monkey (String name, double weight, String habitat, int height, String typeofeat) {
        super(name, weight, habitat, height);
        this.typeofeat = typeofeat;
    }*/

    public void setTypeofeat ( String typeofeat){
        this.typeofeat = typeofeat;
    }
    public String getTypofeat () {
        return typeofeat;
    }

    public void printInfo () {
        System.out.println("Вид животного: " + name);
        System.out.println("Вес: " + weight + " кг.");
        System.out.println("Среда обитания: " + habitat);
        System.out.println("Любимая пища: " + typeofeat);
        System.out.println("Рост взрослого животного: " + height + " см.");
    }


    }


