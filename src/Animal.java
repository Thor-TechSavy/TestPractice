public class Animal {
    public static void main(String[] args) {
        Animal a = new Animal("anumal");
    }

    public Animal() {
        System.out.println("Hello");
    }

    public Animal(String a) {
        System.out.println(a);
    }

    public static void printName() {
        System.out.println("Animal");
    }
}
