import java.util.ArrayList;
import java.util.List;
import konzert.KonzertTicket;
import konzert.KonzertTicketFabrik;
import org.junit.jupiter.api.Test;

public class TicketTest {
    @Test
    public void Ticketdemonstration(){
        List<KonzertTicket> ticketListe = new ArrayList<>();
        KonzertTicketFabrik konzertTicketFabrik = new KonzertTicketFabrik("mittelmaessiges Konzert");
        for (int i = 0; i < 100; i++) {
            ticketListe.add(konzertTicketFabrik.Ticket());
        }
        for(KonzertTicket t: ticketListe) {
            System.out.println(t.verifiziereDich());
        }
    }
}
