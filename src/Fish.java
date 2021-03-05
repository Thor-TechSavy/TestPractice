public class Fish extends Animal {

    public static void main(String[] args) {
        Animal a = new Fish("aaaaaa");
    }

    public Fish() {
        System.out.println("fish");
    }

    public Fish(String a) {
        super(a);
    }

    public static void printName() {
        System.out.println("FISH");
    }
}
