class Sparrow  extends Animal {
    String sounds;
    String strange = "красный воробей";



    public Sparrow (String name, double weight) {
        super(name, weight);
        this.sounds = "чык-чырык";

    }

    public Sparrow (String name, double weight, String sounds) {
        super(name, weight);
        this.sounds =sounds;

    }

    public void setTypeofeat(String sounds) {
        this.sounds = sounds;
    }

    public String getSounds() {
        return sounds;
    }

    public void printInfo() {
        System.out.println("Вид животного: " + name);
        System.out.println("Вес: " + weight + " кг.");
        System.out.println("Издваемый звук: " + sounds);

    }
    public void homeSparrow(){
        System.out.println("Вид животного: " + name);
        System.out.println("Вес: " + weight + " кг.");
        System.out.println(strange);
    }
}