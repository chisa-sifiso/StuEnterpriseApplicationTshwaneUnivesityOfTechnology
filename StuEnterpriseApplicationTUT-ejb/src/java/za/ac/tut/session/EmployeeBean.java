/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package za.ac.tut.session;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.model.Employee;

/**
 *
 * @author Sifiso
 */
@Stateless
@LocalBean
public class EmployeeBean implements EmployeeService {
    
    
    @PersistenceContext(unitName = "StuEnterpriseApplicationTUT-ejbPU")
    private EntityManager entity;
    
    @Override
    public void addEmp(Employee emp) {
       entity.persist(emp);
    }

    @Override
    public Employee findEmp(int empno) {
      return entity.find(Employee.class, empno);//note
    }

    @Override
    public String updateEmp(Employee emp) {
       Employee empObj = findEmp(emp.getEmp());//note
       if(empObj!=null){
           entity.merge(emp);
           return "record updated";
       }
       else{
            return "record not updated";
       }
    }

    @Override
    public String deleteEmp(int empno) {
       Employee empObj = findEmp(empno);//note
       if(empObj!=null){
           entity.remove(empObj);
           return "record deleted";
       }
       else{
            return "record not deleted";
       }
    }

    @Override
    public List<Employee> getAllEmp() {
      String sql ="select emp from Employee emp";
      Query jpQuery =  entity.createQuery(sql);
      List<Employee> employees =(List<Employee>) jpQuery.getResultList();
      return employees;
      
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
