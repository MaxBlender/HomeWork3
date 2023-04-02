package ru.crock.java.homework.IndividualMobil;

import java.time.format.DateTimeFormatter;

public class ElScooter extends InvidualCar{

    private final boolean seatAvailability;

    private final boolean headlightAvailability;

    public ElScooter(int id, String model, int power, int powerRange, int batteryCapacity, boolean seatAvailability, boolean headlightAvailability) {
        super(id, model, power, powerRange, batteryCapacity);
        this.seatAvailability = seatAvailability;
        this.headlightAvailability = headlightAvailability;
    }

    /**
     * Получение полной информации о транспортном средстве
     * @return строка с полной информацией о тс
     */
    @Override
    public String getInfo(){
        return "Модель - " + super.getModel() + ". Мощность - " + super.getPower()
                + "вт. Пробег на одной зарядке - " + super.getPowerRange() + "км. Емкость батареи - "
                + super.getBatteryCapacity() + ". Наличие сидения - " + (seatAvailability ? "Да" : "Нет")
                + ". Наличие фар - " + (headlightAvailability ? "Да" : "Нет")
                + ". id - " + super.getId() + (super.getTimeEndrent() != null ? ". Находится в аренде до: "
                + super.getTimeEndrent().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) : ". Не находится в аренде");
    }
}
