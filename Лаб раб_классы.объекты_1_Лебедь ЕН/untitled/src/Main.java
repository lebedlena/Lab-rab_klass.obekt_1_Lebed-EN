public class Main {
    public static void main(String[] args) {
        Person man = new Person(25, "Alex");
        Person woman = new Person(18, "Lana");
        man.move(woman.fullName);
        woman.talk(man.fullName);


    }
}