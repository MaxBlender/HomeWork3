package ru.crock.java.homework.IndividualMobil;

import ru.crock.java.homework.Transport;

/**
 * Класс средств индивидуальной мобильности
 */

public class InvidualCar extends Transport {


    private final int power;

    private final int powerRange;

    private final int batteryCapacity;

    public int getPower() {
        return power;
    }

    public int getPowerRange() {
        return powerRange;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public InvidualCar(int id, String model, int power, int powerRange, int batteryCapacity) {
        super(id, model);
        this.power = power;
        this.powerRange = powerRange;
        this.batteryCapacity = batteryCapacity;
    }

    /**
     * Получение полной информации о транспортном средстве
     * @return строка с полной информацией о тс
     */
    @Override
    public String getInfo(){
        return "Модель - " + super.getModel()
                + ".Мощность в ваттах - " + power
                + ". Пробег на одной зарядке - " + powerRange
                + ". Емкость батареи - " + batteryCapacity
                + "id - " + super.getId();
    }

}
