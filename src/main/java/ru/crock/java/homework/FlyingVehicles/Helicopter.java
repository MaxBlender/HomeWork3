package ru.crock.java.homework.FlyingVehicles;

import java.time.format.DateTimeFormatter;

public class Helicopter extends FlyCar{
    private final String type;

    public Helicopter(int id, String model, int maxHeight, int loadCapacity, int numberPassengerSeats, String type) {
        super(id, model, maxHeight, loadCapacity, numberPassengerSeats);
        this.type = type;
    }

    /**
     * Получение полной информации о транспортном средстве
     * @return строка с полной информацией о тс
     */
    @Override
    public String getInfo(){
        return "Модель - " + super.getModel()
                + ". Тип вертолета - " + type
                + ". Максимальная высота - " + super.getMaxHeight()
                + "км. Грузоподьемность - " + super.getLoadCapacity()
                + "кг. Число пассажирских сидений - " + super.getNumberPassengerSeats()
                + ". id - " + super.getId() + (super.getTimeEndrent() != null ? ". Находится в аренде до: "
                + super.getTimeEndrent().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) : ". Не находится в аренде");
    }

}
