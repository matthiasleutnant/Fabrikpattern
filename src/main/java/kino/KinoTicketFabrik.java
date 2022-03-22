package kino;

import pattern.TicketFabrikInterface;

public class KinoTicketFabrik implements TicketFabrikInterface {

    private final String filmname;

    public KinoTicketFabrik(String filmname) {

        this.filmname = filmname;
    }

    int ticketzaehler = 0;

    @Override
    public KinoTicket Ticket() {
        KinoTicket ergebnis = new KinoTicket();
        ergebnis.setId(ticketzaehler++);
        ergebnis.setFilm(filmname);
        System.out.println("Das " + ticketzaehler + "te Ticket fuer den Film " + filmname + " ausgegeben");
        return ergebnis;
    }

    @Override
    public KinoProgramm Programm() {
        KinoProgramm ergebnis = new KinoProgramm();
        ergebnis.setProgramm(filmname);
        System.out.println("Ein Programm fuer den Film " + filmname + " ausgegeben");
        return ergebnis;
    }
}
