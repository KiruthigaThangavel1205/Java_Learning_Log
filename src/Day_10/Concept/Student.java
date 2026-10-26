package Day_10.Concept;
import java.util.*;
public class Student {
    Scanner sc = new Scanner (System.in);
    private int id;
    private String dept;
    private String name;

    void setId(int id)
    {
        if(id>0)
            this.id = id;
        else System.out.println("Invalid ID");
    }
    int getId()
    {
        return id;
    }
    void setDept(String dept)
    {
        this.dept=dept;
    }
    String getDept()
    {
        return dept;
    }
    void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return name;
    }

    void display()
    {
        System.out.println("ID: "+getId());
        System.out.println("Dept: "+getDept());
        System.out.println("Name: "+getName());
    }
}

