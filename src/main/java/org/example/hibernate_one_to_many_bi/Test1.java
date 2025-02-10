package org.example.hibernate_one_to_many_bi;

import org.example.hibernate_one_to_many_bi.entity.Department;
import org.example.hibernate_one_to_many_bi.entity.Employee;
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
            Employee employee = session.get(Employee.class, 4);
            session.delete(employee);



            session.getTransaction().commit();
            System.out.println("Done");


//            Department dep = new Department("IT", 300, 1200);
//            Employee emp1 = new Employee("Di", "Shu", 800);
//            Employee emp2 = new Employee("Al", "Um", 500);
//            dep.addEmployeeForDepartment(emp1);
//            dep.addEmployeeForDepartment(emp2);
//
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            session.save(dep);
//
//
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
