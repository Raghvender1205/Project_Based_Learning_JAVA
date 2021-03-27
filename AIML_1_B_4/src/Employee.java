import java.io.Serializable;

public class Employee implements Serializable{
    private int id;
    private String name;
    private double salary;
    private int age;

    public int getid(){
        return id;
    }
    private void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "Employee [id="+id +", name="+name+", salary="+salary+", age="+age+"]";
    }
    public void setName(String name){
        this.name = name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public Employee(int id, String name, double salary, int age){
        super();
        setId(id);
        setName(name);
        setSalary(salary);
        setAge(age);
    }
}
