package ru.crock.java.homework;

import java.time.LocalDateTime;

/**
 * Абстрактный класс транспорта
 */
public abstract class Transport {

    private final int id;
    private final String model;

    private LocalDateTime timeEndrent = null;

    public LocalDateTime getTimeEndrent() {
        return timeEndrent;
    }

    protected Transport(int id, String model){
        this.id = id;
        this.model = model;
    }

    /**
     * Аренда машины
     * @param timeEndrent - время + часы аренды
     */
    public void rent(LocalDateTime timeEndrent){
        if (timeEndrent.isAfter(LocalDateTime.now()) && this.timeEndrent == null){
            this.timeEndrent = timeEndrent;
        }
    }

    protected String getModel(){
        return this.model;
    }

    public int getId(){
        return this.id;
    }

    /**
     * Проверка
     * @return время конца аренды
     */
    public boolean isEndrent(){
        return this.timeEndrent != null;
    }


    /**
     * Закончить аренду
     */
    public void endRent(){
        this.timeEndrent = null;
    }


    /**
     * Получение полной информации о транспортном средстве
     * @return строка с полной информацией о тс
     */
    public String getInfo(){
        return "id = " + id;
    }
}
