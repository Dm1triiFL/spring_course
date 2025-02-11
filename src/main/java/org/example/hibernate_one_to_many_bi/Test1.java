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



//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 4);
//            session.delete(employee);
//
//
//
//            session.getTransaction().commit();
//            System.out.println("Done");

//*******************************************************
//            Department dep = new Department("Sales", 800, 1200);
//            Employee emp1 = new Employee("Di", "Shu", 800);
//            Employee emp2 = new Employee("Al", "Um", 1200);
//            Employee emp3 = new Employee("K", "un", 1200);
//            dep.addEmployeeForDepartment(emp1);
//            dep.addEmployeeForDepartment(emp2);
//            dep.addEmployeeForDepartment(emp3);

            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 5);

            System.out.println("Show department");
            System.out.println(department);

            System.out.println("Подгрузка работников до закрытия сессии");
            department.getEmps().get(0);
            session.getTransaction().commit();

            System.out.println("Show employees of department");
            System.out.println(department.getEmps());
            System.out.println("Done");

        }
        finally {
            session.close();
            factory.close();
        }

    }
}
