package com.company;
import com.company.Employee;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main  {

    void printEmployee(Employee em) {
        System.out.println("[Name: " + em.name
                +", Department: " + em.department  +
                ", Salary: " + em.salary + "]\n");
    }

    void filtration(ArrayList<Employee> em, Predicate<Employee> lamb) {
      for(Employee e : em){
          if(lamb.test(e))
              printEmployee(e);
      }
    }



    public static void main(String[] args)  {

        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("John", "HR", 33));
        emp.add(new Employee("Andry", "Sales", 145));
        emp.add(new Employee("Hendy", "IT", 220));
        emp.add(new Employee("Anna", "HR", 99));
        emp.add(new Employee("Julia", "Sales", 1));



        Main test = new Main();
        test.filtration(emp, x -> x.name.equals("Anna") && x.salary<200);
        test.filtration(emp, x -> {return x.department.equals("IT");});
        test.filtration(emp, (x)->x.name.equals("John") && x.department.equals("HR"));
    }

}