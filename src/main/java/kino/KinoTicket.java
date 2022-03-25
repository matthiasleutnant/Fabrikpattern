package kino;


import pattern.TicketInterface;

public class KinoTicket implements TicketInterface {
    private int id;
    private String film;

    KinoTicket() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilm() {
        return film;
    }

    void setFilm(String film) {
        this.film = film;
    }

    @Override
    public String verifiziereDich() {
        return this.getClass().getName() + " - " + id + " - " + film;
    }
}
