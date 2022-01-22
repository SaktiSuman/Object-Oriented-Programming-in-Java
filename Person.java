public class Person {
    private int id;
    private String name;
    private float salary;

    public Person(){
        System.out.println("Constructor called..");
        //The attributes are given default values.If the attributes are not initialised then the default value swill be printed.
        //If the attributes are initialised then it will take the initialised values.
        //This is default constructor.
        id = 899;
        name = "sakti Suman";
        salary = 500000;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int id, String name, float salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void personInfo(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
