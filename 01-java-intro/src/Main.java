import model.Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1L,"John","Doe",35);
        System.out.println(p1);
        Person p2 = new Person(2L,"Jane","Doe",25);
        System.out.println(p2);
        System.out.printf("Are p1 and p2 equal? -> %b%n",p1.equals(p2));
    }
}
