
class Employee
{
    String name;
    int age;
    String city;
    public Employee(String name,int age,String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }
    public String toString() {
        return "Name: " + name+ " age: "+age+" City: "+city;
    }
}
interface EmpInterface
{
    Employee get(String name,int age,String city);
}
public class EmployeeClass {
    public static void main(String[] args) {
        EmpInterface emp=Employee::new;
        System.out.println("Details of Employee are");
        System.out.println(emp.get("Divakar",21,"Lucknow"));
        System.out.println(emp.get("Amir",22,"Azamgarh"));
        System.out.println(emp.get("Ayush",20,"Banda"));
    }

}
