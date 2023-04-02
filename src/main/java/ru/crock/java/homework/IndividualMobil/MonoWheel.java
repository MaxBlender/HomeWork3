package ru.crock.java.homework.IndividualMobil;

import java.time.format.DateTimeFormatter;

public class MonoWheel extends InvidualCar{

    private final String IP65;

    private final boolean handleAvailability;

    public MonoWheel(int id, String model, int power, int powerRange, int batteryCapacity, String IP65, boolean handleAvailability) {
        super(id, model, power, powerRange, batteryCapacity);
        this.IP65 = IP65;
        this.handleAvailability = handleAvailability;
    }

    /**
     * Получение полной информации о транспортном средстве
     * @return строка с полной информацией о тс
     */
    @Override
    public String getInfo(){
        return "Модель - " + super.getModel() + ". Мощность в ваттах - "
                + super.getPower()
                + ". Пробег на одной зарядке - " + super.getPowerRange() + ". Емкость батареи - "
                + super.getBatteryCapacity() + ". Степень защиты - " + IP65 + ". Наличие ручки - "
                + (handleAvailability? "Да": "Нет") +
                ". id - " + super.getId() + (super.getTimeEndrent() != null ? ". Находится в аренде до: "
                + super.getTimeEndrent().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) : ". Не находится в аренде");
    }
}
