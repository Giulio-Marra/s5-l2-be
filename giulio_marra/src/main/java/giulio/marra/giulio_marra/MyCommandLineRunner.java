package giulio.marra.giulio_marra;

import giulio.marra.giulio_marra.entities.Menu;
import giulio.marra.giulio_marra.entities.Ordini;
import giulio.marra.giulio_marra.entities.Pizze;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class MyCommandLineRunner implements CommandLineRunner {



    @Autowired
    private Menu menu;

    @Autowired
    private Pizze margherita;

    @Autowired
    private Pizze funghiPizza;

    @Override
    public void run(String... args) throws Exception {
        List<Pizze> pizzeSelezionate = Arrays.asList(margherita, funghiPizza);

        Ordini ordine = new Ordini(1,3,1, LocalDate.now(), pizzeSelezionate);

        menu.stampaMenu();
    }
}
