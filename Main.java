public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Андрій", 20);
        Person person2 = new Person("Марія", 16);

        System.out.println(person1.getName() + " є повнолітнім: " + person1.isAdult());
        System.out.println(person2.getName() + " є повнолітнім: " + person2.isAdult());
    }
}
