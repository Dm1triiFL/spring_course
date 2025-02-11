package org.example.hibernate_one_to_many_uni;


import org.example.hibernate_one_to_many_uni.entity.Department;
import org.example.hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;


        try {

            session = factory.getCurrentSession();
            session.beginTransaction();
            Department department = session.get(Department.class, 2);
            session.delete(department);

            session.getTransaction().commit();
            System.out.println("Done");


//            Department dep = new Department("HR", 500, 1500);
//            Employee emp1 = new Employee("Ov", "iv", 800);
//            Employee emp2 = new Employee("Ar", "Dam", 500);
//            dep.addEmployeeForDepartment(emp1);
//            dep.addEmployeeForDepartment(emp2);
//
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done");

        }
        finally {
            session.close();
            factory.close();
        }

    }
}
