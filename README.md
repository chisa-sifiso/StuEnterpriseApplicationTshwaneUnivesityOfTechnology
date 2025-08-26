# StuEnterpriseApplicationTUT

## 📌 Overview
StuEnterpriseApplicationTUT is a **Java EE enterprise application** built in **NetBeans** and deployed on **GlassFish 5**.  
It demonstrates **MVC design pattern**, **EJB**, **Servlets**, and **JPA with JDBC persistence unit** for managing employees.

---

## ⚙️ Technologies
- Java EE (JEE 8)  
- GlassFish 5 Application Server  
- NetBeans IDE  
- Enterprise Java Beans (EJB)  
- Servlets & JSP (Web Layer)  
- Java Persistence API (JPA)  
- JDBC Persistence Unit  

---

## 🏗️ Project Structure
### Modules
- **EJB Module** → StuEnterpriseApplicationTUT-ejb.jar`  
- **Web Module** → StuEnterpriseApplicationTUT-war.war`  
- **EAR Module** → Bundles WAR + EJB for deployment  

### Packages
- za.ac.tut.model → Entity classes (`Employee.java`)  
- za.ac.tut.session → Service classes (`EmployeeBean.java`, `EmployeeService.java`)  
- za.ac.tut → Web/Controller classes (`EmployeeServlet.java`)  
- Web Pages → `index.html`, `WEB-INF/`  

---

## 🧩 MVC Design
- **Model** → `Employee.java` (JPA entity)  
- **View** → JSP / HTML pages (`index.html`)  
- **Controller** → `EmployeeServlet.java`  
- **Service Layer** → `EmployeeBean.java` (`@Stateless` EJB)  

---

## 🗄️ Persistence
- **Persistence Unit:** `StuEnterpriseApplicationTUT-ejbPU`  
- Defined in `persistence.xml`  
- Uses **EntityManager** (`@PersistenceContext`) for CRUD operations  

---

## 🔑 Core Classes
- `Employee.java` → Entity class (database table mapping)  
- `EmployeeService.java` → Service interface (CRUD contract)  
- `EmployeeBean.java` → Stateless EJB (business + persistence logic)  
- `EmployeeServlet.java` → Controller (handles HTTP requests)  

---

## 📦 Deployment
1. Build project in **NetBeans**  
2. Deploy on **GlassFish 5**, domain1  
3. Access via browser → `http://localhost:8080/StuEnterpriseApplicationTUT`  

---

## 📝 Features
- Add Employee  
- Find Employee by ID  
- Update Employee  
- Delete Employee  
- List all Employees  

---

## 🚀 Flow
1. User interacts with **UI** (`index.html` / servlet)  
2. Servlet forwards request → **EJB (EmployeeBean)**  
3. EJB uses **EntityManager (JPA)** → database  
4. Response returned → Servlet → View  

