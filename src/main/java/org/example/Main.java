package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//
//        Alien a1 = new Alien();
//        a1.setAid(101);
//        a1.setName("Something");
//        a1.setTech("Java");

        // hey hibernate save with a1 object

        Configuration config = new Configuration();
        config.addAnnotatedClass(Alien.class);
        config.configure();

        SessionFactory factory = config.buildSessionFactory();

        Session session = factory.openSession();
        Alien a1 = session.get(Alien.class, 102);

        System.out.println(a1);

        session.close();
        factory.close();
    }
}