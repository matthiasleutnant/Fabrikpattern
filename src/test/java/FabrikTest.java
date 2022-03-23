import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import kino.KinoTicketFabrik;
import konzert.KonzertTicketFabrik;
import org.junit.jupiter.api.Test;
import pattern.TicketFabrikInterface;

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

    private void initialisiereFabriken() {
        fabriken.add((TicketFabrikInterface) new KonzertTicketFabrik("gutes Konzert"));
        fabriken.add((TicketFabrikInterface) new KinoTicketFabrik("guter Film"));
    }

    private void zufaelligeAktion() {
        TicketFabrikInterface zufaelligeFabrik = fabriken.get(ThreadLocalRandom.current().nextInt(fabriken.size()));
        if(Math.random()<thrashold) {
            zufaelligeFabrik.Programm();
        }
        else {
            zufaelligeFabrik.Ticket();
        }
    }
}
