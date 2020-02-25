package com.company;

public class Main {

    public static void main(String[] args) {
        //tworzymy obiekt z klasy Person - obiekt - pawel zamiast kilku zmiennych mamy to wszystko w postaci jednej zmiennej/obiektu "pawel", to samo zrobiliśmy dla mikołaja
        Person pawel = new Person();
        pawel.name = "Paweł";
        pawel.age = 18;
        pawel.isAlive = true;
        pawel.isWorking = true;

        Person mikolaj = new Person();
        mikolaj.name = "Mikołaj";
        mikolaj.age = 100;
        mikolaj.isAlive = false;


        //Zamiast tych kilku zmiennych poniżej dla pawła i mikołaja utwożyliśmy powyżej po jednym obiekcie klasy person dla każdego z nich
        //String name1 = "Paweł";
        //int age1 = 18;
        //boolean isAlive1 = true;

        //String name2 = "Mikołaj";
        //int age2 = 100;
        //boolean isAlive2 = false;

        //tworzymy taką medtodę przedstawSię(), musimy ją w klasie Person zadeklarować
        //po zadeklarowaniu możemy tu wpisać jakieś argumenty metod w nawiasach () tu wpisujemy tylko wartość argumentó np. true, false, zaś w deklaracji określamy typ
        //boolean formal = false;
        pawel.przedstawSię(false);
        mikolaj.przedstawSię(true);

    }
}
