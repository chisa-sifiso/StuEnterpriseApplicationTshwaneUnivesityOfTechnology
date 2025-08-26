/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.session;

import java.util.List;
import javax.ejb.Remote;
import za.ac.tut.model.Employee;

/**
 *
 * @author Sifiso
 */
@Remote
public interface EmployeeService {
 public void addEmp(Employee emp);
 public Employee findEmp(int empno);
 public  String updateEmp(Employee emp);
 public String deleteEmp(int empno);
 public List<Employee> getAllEmp();
    
    
}
