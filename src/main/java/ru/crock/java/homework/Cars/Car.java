package ru.crock.java.homework.Cars;

import ru.crock.java.homework.Transport;

/**
 * Класс автомобилей
 */

public class Car extends Transport {

    private final String carEquipment;

    public String getCarEquipment() {
        return carEquipment;
    }

    public Car(int id, String model, String complectation) {
        super(id, model);
        this.carEquipment = complectation;
    }


    /**
     * Получение полной информации о транспортном средстве
     * @return строка с полной информацией о тс
     */
    @Override
    public String getInfo(){
        return "Модель - " + super.getModel()
                + ". Комплектация - "
                + carEquipment + ". id - " + super.getId();
    }
}
