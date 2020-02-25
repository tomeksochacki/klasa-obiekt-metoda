package com.company;

public class Person {
    //ta klasa Person posiada poniższe pola, musimy pamiętać że najpierw zawsze tworzymy deklarujemy jakieś pole aby je móc poźniej użyć/wykorzystać w obiekcie
    String name;
    int age;
    boolean isAlive;
    boolean isWorking;

    //tu deklarujemy metodę przedstaw się, która nic nie zwraca.
    //Nawiasy () sugerują że to jest metoda
    //przy tworzeniu metody - deklaracji musimy podać typ jakiego oczekuje ta metoda - w nawiasach ()
    void przedstawSię(boolean formal){
        if (formal){
        System.out.println("Witam Państwa mam na imię " + name + " mam " + age + " lat");
        } else {
        System.out.println("Cześć jestem " + name + " mam " + age + " lat");
        }
    }


}
