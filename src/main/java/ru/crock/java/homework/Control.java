package ru.crock.java.homework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


/**
 * Класс контроллер аренды
 */
public class Control {


    List<Transport> AllTransport = new ArrayList<>();

    /**
     * Получение информации об арендованном тс
     * @param date дата
     * @return строка с полной информацией о тс
     */
    public String getRent(String date) {

        LocalDateTime time = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        StringBuilder report = new StringBuilder();
        for (var elem : AllTransport) {
            if (elem.getTimeEndrent() != null) {
                if (elem.getTimeEndrent().isAfter(time)) {
                    report.append(elem.getInfo()).append("\n");
                }
            }
        }
        return report.toString();
    }


    /**
     * Аренда транспортного средства по id
     * @param hours кол-во часов аренды
     * @param id id тс
     */
    public void rent(int hours, int id){
        for (var el : AllTransport) {
            if (el.getId() == id){
                if (!el.isEndrent()){
                    el.rent(LocalDateTime.now().plusHours(hours));
                }
            }
        }
    }


    /**
     * Закончить аренду транспортного средства по id
     * @param id id тс
     */
    public void endRent(int id){
        for (var el:AllTransport) {
            if (el.getId() == id){
                el.endRent();
            }
        }
    }


    /**
     * Регистрация нового транспортного средства
     * @param ts объект тс
     */
    public void addTransport(Transport ts) {
        for (var el : AllTransport) {
            if (el.getId() == ts.getId()) {
                return;
            }
        }
        AllTransport.add(ts);
    }


    /**
     * Списать транспортное средство
     * @param id id тс
     */
    public void removeTransport(int id) {
        for (int i = 0; i < AllTransport.size(); i++) {
            if (AllTransport.get(i).getId() == id) {
                AllTransport.remove(AllTransport.get(i));
            }
        }
    }


    /**
     * Отчет о транспортных средствах
     * @return полная информация о транспортном средстве
     */
    public String SWOT() {
        StringBuilder response = new StringBuilder();
        for (var el : AllTransport) {
            response.append(el.getInfo()).append("\n");
        }
        return response.toString();
    }

}
