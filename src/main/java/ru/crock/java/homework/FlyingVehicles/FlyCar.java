package ru.crock.java.homework.FlyingVehicles;

import ru.crock.java.homework.Transport;


/**
 * Класс летательного транспортного средства
 */

public class FlyCar extends Transport {

    private final int maxHeight;
    private final int loadCapacity;
    private final int numberPassengerSeats;

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getNumberPassengerSeats() {
        return numberPassengerSeats;
    }

    public FlyCar(int id, String model, int maxHeight, int loadCapacity, int numberPassengerSeats) {
        super(id, model);
        this.maxHeight = maxHeight;
        this.loadCapacity = loadCapacity;
        this.numberPassengerSeats = numberPassengerSeats;
    }

    /**
     * Получение полной информации о транспортном средстве
     * @return строка с полной информацией о тс
     */
    @Override
    public String getInfo(){
        return "Модель - " + super.getModel()
                + ". Максимальная высота - " + maxHeight
                + "км. Грузоподьемность - " + loadCapacity
                + "кг. Число пассажирских сидений - " + numberPassengerSeats
                + ". id - " + super.getId();
    }
}
