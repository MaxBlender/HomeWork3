package ru.crock.java.homework.cars;

import java.time.format.DateTimeFormatter;

public class Passenger extends Car{

    private final int numberPassengerSeats;

    public Passenger(int id, String model, String complectation, int numberPassengerSeats) {
        super(id, model, complectation);
        this.numberPassengerSeats = numberPassengerSeats;
    }

    /**
     * Получение полной информации о транспортном средстве
     * @return строка с полной информацией о тс
     */
    @Override
    public String getInfo(){
        return  "Модель - " + super.getModel()
                + ". Комплектация - " + super.getCarEquipment()
                + ". Число пассажирских сидений - " + numberPassengerSeats
                + ". id - " + super.getId() + (super.getTimeEndrent() != null ? ". Находится в аренде до: "
                + super.getTimeEndrent().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) : ". Не находится в аренде");

    }

}
