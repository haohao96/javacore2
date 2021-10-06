package ClassChapter.pojo;

import org.junit.Test;

public class Tests {
    @Test
    public void test1()
    {
        Employee[] employees=new Employee[2];
        employees[0]=new Employee("一",1,1,0,1);
        employees[1]=new Employee("二",2,2,2,2);
//		employees[1]=new Employee("一",1,1,0,1);


		/*System.out.println(employees[0].toString());
		employees[0].raiseSalary(50);
		System.out.println(employees[0].toString());*/


		/*Date d=employees[0].getHireday();
		System.out.println(employees[0].getHireday());
		d.setTime(d.getTime()-24*60*60*1000);
		System.out.println(employees[0].getHireday());
		System.out.println(d);*/

        System.out.println(employees[0].equals(employees[1]));
        employees[0].setName("pp");
        System.out.println(employees[0].toString());
    }

    //	静态域
    @Test
    public void test2()
    {
        Employee employee1=new Employee();
        Employee employee2=new Employee();
        System.out.println("employee1静态域cnt="+employee1.cnt);
        System.out.println("employee2静态域cnt="+employee2.cnt);
        Employee.cnt++;
        System.out.println("employee1静态域cnt="+employee1.cnt);
        System.out.println("employee2静态域cnt="+employee2.cnt);
        employee1.cnt++;
        System.out.println("employee1静态域cnt="+employee1.cnt);
        System.out.println("employee2静态域cnt="+employee2.cnt);
    }

}
