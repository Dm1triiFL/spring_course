package org.example.hibernate_test;

import org.example.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp = session.get(Employee.class, 1);
            emp.setSalary(2000);
            session.createQuery("update Employee set name = 'Kirill' where id = '4'").executeUpdate();
            session.getTransaction().commit();

            System.out.println("Done");

        }
        finally {
            factory.close();
        }

    }
}
