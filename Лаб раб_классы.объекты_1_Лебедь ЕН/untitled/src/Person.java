public class Person {

    int age;
    String fullName;
    Person (int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }
    static void talk(String fullName) {
        System.out.println("Привет, "+fullName+"!");
    }
    static void move(String fullName){
        System.out.println(fullName+" идёт в школу");
    }

}