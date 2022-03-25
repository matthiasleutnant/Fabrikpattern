import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import kino.KinoTicketFabrik;
import konzert.KonzertTicketFabrik;
import org.junit.jupiter.api.Test;
import pattern.TicketFabrikInterface;
import pattern.TicketInterface;

public class FabrikTest {

    private List<TicketFabrikInterface> fabriken = new ArrayList<>();
    private final double thrashold = 0.6;

    @Test
    public void Fabrikdemonstration() {
        initialisiereFabriken();
        for (int i = 0; i < 100; i++) {
            zufaelligeAktion();
        }

    }

    @Test
    public void Ticketdemonstration(){
        List<TicketInterface> ticketListe = new ArrayList<>();
        initialisiereFabriken();
        for (int i = 0; i < 100; i++) {
            ticketListe.add(getZufaelligeFabrik().Ticket());
        }
        for(TicketInterface t: ticketListe) {
            System.out.println(t.verifiziereDich());
        }
    }

    private void initialisiereFabriken() {
        fabriken.add((TicketFabrikInterface) new KonzertTicketFabrik("gutes Konzert"));
        fabriken.add((TicketFabrikInterface) new KinoTicketFabrik("guter Film"));
    }

    private void zufaelligeAktion() {
        if(Math.random()<thrashold) {
            getZufaelligeFabrik().Programm();
        }
        else {
            getZufaelligeFabrik().Ticket();
        }
    }

    private TicketFabrikInterface getZufaelligeFabrik() {
        TicketFabrikInterface zufaelligeFabrik = fabriken.get(ThreadLocalRandom.current().nextInt(fabriken.size()));
        return zufaelligeFabrik;
    }
}
