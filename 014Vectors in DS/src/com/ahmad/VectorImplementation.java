package com.ahmad;

import java.util.List;
import java.util.Vector;

/**
 * @author Bashir Ahmad
 */
public class VectorImplementation {
   public static void main(String[] args) {
        List<Employee> emplist = new Vector<Employee>();
        
        emplist.add(new Employee(123, "Bashir", "Ahmadi"));
        emplist.add(new Employee(124, "Basir", "Ahmadi"));
        emplist.add(new Employee(126, "Bader", "Ahmadi"));
        emplist.add(new Employee(128, "Shir", "Ahmadi"));
        
        emplist.set(1, new Employee(232, "Ali", "Mazari"));
        emplist.add(3, new Employee(434, "Mohammad", "Abdullah"));
        emplist.forEach(emp -> System.out.println(emp));
        System.out.println(emplist.size());
        
    } 
}
