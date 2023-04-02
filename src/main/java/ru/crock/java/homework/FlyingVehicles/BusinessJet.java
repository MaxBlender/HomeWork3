package ru.crock.java.homework.FlyingVehicles;

import java.time.format.DateTimeFormatter;

/**
 * Класс бизнес-джетов
 */
public class BusinessJet extends FlyCar{

    private final String engineType;


    public BusinessJet(int id, String model, int maxHeight, int loadCapacity, int numberPassengerSeats, String engineType) {
        super(id, model, maxHeight, loadCapacity, numberPassengerSeats);
        this.engineType = engineType;
    }

    /**
     * Получение полной информации о транспортном средстве
     * @return строка с полной информацией о тс
     */
    @Override
    public String getInfo(){
        return "Модель - " + super.getModel()
                + ". Тип двигателя - " + engineType
                + ". Максимальная высота - " + super.getMaxHeight()
                + "км. Грузоподьемность - " + super.getLoadCapacity()
                + "кг. Число пассажирских сидений - " + super.getNumberPassengerSeats()
                + ". id - " + super.getId() + (super.getTimeEndrent() != null ? ". Находится в аренде до: "
                + super.getTimeEndrent().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) : ". Не находится в аренде");
    }

}
