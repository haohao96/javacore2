package ClassChapter.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Objects;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {

    public static int cnt=0;
//    private static int cnt=0;

    private String name;
    private double salary;
    private Date hireday;

    public Employee(String name,double salary,int year,int mounth,int day)
    {
        this.name=name;
        this.salary=salary;
        this.hireday=new Date(year,mounth,day);
    }

    public Date getHireday() {
        return (Date) hireday.clone();
    }

    public void raiseSalary(double percent)
    {
        double raise=salary*percent/100;
        salary=salary+raise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                name.equals(employee.name) &&
                Objects.equals(hireday, employee.hireday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireday);
    }
}
