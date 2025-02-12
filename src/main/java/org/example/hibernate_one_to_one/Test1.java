package org.example.hibernate_one_to_one;

import org.example.hibernate_one_to_one.entity.Detail;
import org.example.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();


        try {
            session.beginTransaction();
            Detail detail = session.get(Detail.class, 4);
            System.out.println(detail.getEmployee());

            session.delete(detail);
            session.getTransaction().commit();
            System.out.println("Done");

        }
        finally {
            session.close();
            factory.close();
        }

    }
}
