
class Person{
    private int age;
    private String name; 
    
    Person(String n,int a){
        this.name=n;
        this.age=a;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}

class Employee extends Person{
    private float salary;

    Employee(String name,int age,float s){
        super(name,age);
        salary=s;
    }

    public float getSalary(){
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp=new Employee("Tanisha",19,196000);

    System.out.println("Name of the employee:"+emp.getName());
    System.out.println("Age of the employee:"+emp.getAge());
    System.out.println("Salary of the employee:"+emp.getSalary());
        
    }
    
}


