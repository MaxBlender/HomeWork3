package ru.crock.java.homework;

import ru.crock.java.homework.FlyingVehicles.BusinessJet;
import ru.crock.java.homework.FlyingVehicles.Helicopter;
import ru.crock.java.homework.Cars.Passenger;
import ru.crock.java.homework.Cars.Truck;
import ru.crock.java.homework.IndividualMobil.ElScooter;
import ru.crock.java.homework.IndividualMobil.MonoWheel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Demonstration {
    public static void main(String[] args) {

    Control AllTransport = new Control();
    AllTransport.addTransport(new Passenger(2, "Ваз2109", "Full", 3));
    AllTransport.addTransport(new Passenger(2, "BMV", "Full", 4));
    AllTransport.addTransport(new MonoWheel(3, "Maxim", 25, 200, 1000, "Да", true));
    AllTransport.addTransport(new Truck(51, "Kamaz", "Comfort", 5000, true));
    AllTransport.addTransport(new Helicopter(12, "МИ-8", 1000, 10000, 4, "Грузовой"));
    AllTransport.addTransport(new BusinessJet(59, "Falcon 900lx", 8000, 6000, 8, "Реактивный"));
    AllTransport.addTransport(new ElScooter(15, "Yandex", 500, 1000, 2000, true, true));
    AllTransport.addTransport(new Helicopter(122, "МИ-38", 6000, 4000, 20, "Пассажирский"));

    AllTransport.rent(5, 3);
    AllTransport.rent(100, 2);
    AllTransport.rent(500, 15);
    AllTransport.rent(120, 122);

    System.out.println("Транспортные средства в аренде");
    System.out.println(AllTransport.getRent(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))));
    System.out.println("Транспортные средства, которые будут в аренде через 120 часов");
    System.out.println(AllTransport.getRent(LocalDateTime.now().plusHours(120).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))));
    System.out.println("\n\nПолный отчет по транспортным средствам");
    System.out.println(AllTransport.SWOT());
    AllTransport.endRent(2);
    System.out.println("\n\nПолный отчет по транспортным средствам после сдачи тс под id 2");
    System.out.println(AllTransport.SWOT());
    AllTransport.removeTransport(15);
    AllTransport.removeTransport(122);
    System.out.println("\n\nПолный отчет по транспортным средствам после удаления тс под id 122, 12");
    System.out.println(AllTransport.SWOT());


    }
}