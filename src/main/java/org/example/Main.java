package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        try (EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("my-persistence-unit")) {
            /*try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
                entityManager.getTransaction().begin();

                Person person = new Person("p1");
                SIM sim1 = SIM.builder().number("111").person(person).build();
                SIM sim2 = SIM.builder().number("222").person(person).build();
                SIM sim3 = SIM.builder().number("333").person(person).build();
                entityManager.persist(sim1);
                entityManager.persist(sim2);
                entityManager.persist(sim3);

                *//*entityManager.persist(person);*//*

                entityManager.getTransaction().commit();
            }*/

            try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
                entityManager.getTransaction().begin();

                Person person = entityManager.find(Person.class, 1L);

                System.out.println("Person name: " + person.getName());

                entityManager.getTransaction().commit();
            }
        }
    }
}