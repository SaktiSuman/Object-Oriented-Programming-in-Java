public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Sakti", 2345);
        Person p2 = new Person(2, "Suman", 4567);
        Person p3 = new Person(3, "Akash", 7890);
        Person p4 = new Person(4, "Atish", 6789);

        System.out.println("Information of person 1: ");
        p1.personInfo();
        System.out.println("Information of person 2: ");
        p2.personInfo();
        System.out.println("Information of person 3: ");
        p3.personInfo();
        System.out.println("Information of person 4: ");
        p4.personInfo();
    }


}
