class Dog extends Animal {
    String typeofeat;


    public Dog (String name, int weight, String habitat, int height) {
        super(name, weight,habitat, height);
        this.typeofeat = "мясо";

    }

    public Dog (String name, int weight,String habitat, int height, String typeofeat) {
        super(name, weight,habitat, height);
        this.typeofeat = typeofeat;
    }


    public void setTypeofeat(String typeofeat) {
        this.typeofeat = typeofeat;
    }

    public String getTypofeat() {
        return typeofeat;
    }

    public void printInfo() {
        System.out.println("Вид животного: " + name);
        System.out.println("Вес: " + weight + " кг.");
        System.out.println("Любимая пища: " + typeofeat);
        System.out.println("Рост взрослого животного: " + height + " см.");
    }

}
