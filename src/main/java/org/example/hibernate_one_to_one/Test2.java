package org.example.hibernate_one_to_one;

import org.example.hibernate_one_to_one.entity.Detail;
import org.example.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();


        try {
//            Employee emp = new Employee("Kolya", "ivanov", "HR", 950);
//            Detail detail = new Detail("new york", "3234234", "midsf@mail.ry");

//            detail.setEmployee(emp);
//            emp.setEmpDetail(detail);

            session.beginTransaction();

            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);
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
