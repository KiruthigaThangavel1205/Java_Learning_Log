package Day_10.Concept;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(101);
        s1.setDept("IT");
        s1.setName("Ram");
        s1.display();
        System.out.println();

        Student s2 = new Student();
        s2.setId(111);
        s2.setDept("CSE");
        s2.setName("Allen");
        s2.display();
        System.out.println();

        Student s3 = new Student();
        s3.setId(112);
        s3.setDept("ECE");
        s3.setName("Miller");
        s3.display();
    }
}
