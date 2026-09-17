package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setName("Something");
        a1.setTech("Java");

        // hey hibernate save with a1 object

        SessionFactory factory = null;
        Session session = factory.openSession();
        session.save(a1);
    }
}