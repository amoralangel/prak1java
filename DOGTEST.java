package DOGTEST;

public class DogTEST {
    public static void main (String [] args) {
        Dog d1 = new Dog("Bobik", 5);
        Dog d2 = new Dog("Sharik",3);
        Dog d3 = new Dog("Torpeda");
        d3.setAge(2);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}