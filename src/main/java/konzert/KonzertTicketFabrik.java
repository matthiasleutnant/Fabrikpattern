package konzert;


import pattern.TicketFabrikInterface;

public class KonzertTicketFabrik implements TicketFabrikInterface {

    private final String konzertname;

    int ticketzaehler = 0;

    public KonzertTicketFabrik(String konzertname) {
        this.konzertname = konzertname;
    }

    @Override
    public KonzertTicket Ticket() {
        KonzertTicket ausgabe = new KonzertTicket();
        ausgabe.setId(ticketzaehler++);
        System.out.println("Das " + ticketzaehler + "te fuer das Konzert " + konzertname + " ausgegeben");
        return ausgabe;
    }

    @Override
    public KonzertProgramm Programm() {
        KonzertProgramm ausgabe = new KonzertProgramm();
        ausgabe.setProgramm(konzertname);
        System.out.println("Ein Programm fuer das Konzert " + konzertname + " ausgegeben");
        return ausgabe;
    }
}
