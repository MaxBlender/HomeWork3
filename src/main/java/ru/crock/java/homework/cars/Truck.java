package ru.crock.java.homework.cars;

import java.time.format.DateTimeFormatter;

public class Truck extends Car{

    private final int loadCapacity;
    private final boolean dangerousSubst;


    public Truck(int id, String model, String complectation, int loadCapacity, boolean dangerousSubst) {
        super(id, model, complectation);
        this.loadCapacity = loadCapacity;
        this.dangerousSubst = dangerousSubst;
    }

    /**
     * Получение полной информации о транспортном средстве
     * @return строка с полной информацией о тс
     */
    @Override
    public String getInfo(){
        return  "Модель - " + super.getModel()
                + ". Комплектация - " + super.getCarEquipment()
                + ". Грузоподъемность - " + loadCapacity
                + "кг. Перевозимость опасных веществ - " + (dangerousSubst ? "Да" : "Нет")
                + ". id - " + super.getId() + (super.getTimeEndrent() != null ? ". Находится в аренде до: "
                + super.getTimeEndrent().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) : ". Не находится в аренде");

    }
}
