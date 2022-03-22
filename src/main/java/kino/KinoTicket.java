package kino;


import pattern.TicketInterface;

public class KinoTicket implements TicketInterface {
    private int id;
    private String Film;

    KinoTicket() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilm() {
        return Film;
    }

    void setFilm(String film) {
        Film = film;
    }
}
