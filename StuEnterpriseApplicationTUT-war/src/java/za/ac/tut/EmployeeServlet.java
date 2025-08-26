/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.Employee;
import za.ac.tut.session.EmployeeService;

/**
 *
 * @author Sifiso
 */
@WebServlet(name = "EmployeeServlet", urlPatterns = {"/EmployeeServlet"})
public class EmployeeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EmployeeServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EmployeeServlet at " + request.getContextPath() + "</h1>");
           
            
            InitialContext context = new InitialContext();
            
            EmployeeService sevice = (EmployeeService) context.lookup("za.ac.tut.session.EmployeeService");
            
            String decide = request.getParameter("select");
            
            if(decide!=null){
                
                if (decide.equals("add")) {
                    out.println("<p>Record addeddddddddddd</p>"+request.getParameter("name")+request.getParameter("surname")+request.getParameter("age")+request.getParameter("salary")+request.getParameter("address"));
                    Employee emp = new Employee();
                    emp.setName(request.getParameter("name"));
                    emp.setSurname(request.getParameter("surname"));
                    emp.setAge(Integer.parseInt(request.getParameter("age")));
                    emp.setSalary(Double.parseDouble(request.getParameter("salary")));
                    emp.setAddress(request.getParameter("address"));
                    sevice.addEmp(emp);
                    out.println("<p>Record added</p>");
                    
                }else if (decide.equals("update")) {
                    out.println("<p>Record added</p>");
                    Employee emp = new Employee();
                    emp.setEmp(2);
                    emp.setName(request.getParameter("name"));
                    emp.setSurname(request.getParameter("surname"));
                    emp.setAge(Integer.parseInt(request.getParameter("age")));
                    emp.setSalary(Double.parseDouble(request.getParameter("salary")));
                    emp.setAddress(request.getParameter("address"));
                   
                    out.println("<p>Record "+ sevice.updateEmp(emp)+"</p>");
                     
                     
                    
                }else if (decide.equals("delete")) {
                        
                     sevice.deleteEmp(1);
                }else if (decide.equals("getAll")) {
                    List<Employee> list=sevice.getAllEmp();
                    for (Employee employee : list) {
                        out.println("<p>Name:"+employee.getName()+" Surname"+employee.getSurname()+"</p></  br>"); 
                    }
                }
                
            }
            out.println("</body>");
            out.println("</html>");
        } catch (NamingException ex) {
            Logger.getLogger(EmployeeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
