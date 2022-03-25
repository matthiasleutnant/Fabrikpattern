package konzert;

import pattern.TicketInterface;

public class KonzertTicket implements TicketInterface {

    private int id;

    KonzertTicket() {

    }

    public int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    @Override
    public String verifiziereDich() {
        return this.getClass().getName() + " - " + id;
    }
}
