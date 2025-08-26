<img width="635" height="114" alt="image" src="https://github.com/user-attachments/assets/1870fc66-e0a5-4ed6-97c5-500a96cec43c" />
<img width="258" height="473" alt="image" src="https://github.com/user-attachments/assets/ad5bd94b-ccb1-4dbb-939f-5e5527d98e8e" />
<img width="1349" height="703" alt="image" src="https://github.com/user-attachments/assets/adbeaf28-af87-4e11-aa3e-dc55209b7e42" />
<img width="1134" height="443" alt="image" src="https://github.com/user-attachments/assets/a295c565-acd6-4496-8db8-9201efe2d7c9" />


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

