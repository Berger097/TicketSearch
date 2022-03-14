package ru.netology.domain;


public class Ticket implements Comparable<Ticket> {
    int id;
    int price;
    String departureAirport;
    String arrivalAirport;
    int time;

    public Ticket(int id, int price, String departureAirport, String arrivalAirport, int time) {
        this.id = id;
        this.price = price;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }



    public boolean matches(String departureAirport, String arrivalAirport) {
        return this.getDepartureAirport().equalsIgnoreCase(departureAirport) && this.getArrivalAirport().equalsIgnoreCase(arrivalAirport);
    }

    @Override
    public int compareTo(Ticket o) {
        return this.price - o.price;
    }
}
