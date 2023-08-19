import java.io.Serializable;

public class Employee implements Serializable  {
    
    transient int empid; // will not take part in Serialization process
    public String empName;
    public int salary;

    
    public Employee(int empid, String empName, int salary) {
        this.empid = empid;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", empName=" + empName + ", salary=" + salary + "]";
    }

    
    
}

