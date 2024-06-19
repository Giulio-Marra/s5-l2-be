package giulio.marra.giulio_marra;

import giulio.marra.giulio_marra.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    private Menu menu;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(GiulioMarraApplication.class);

        Double coperto = ctx.getBean("coperto", double.class);

        Tavoli tavolo = ctx.getBean("tavolo3", Tavoli.class);

        List<Pizze> pizzeSelezionate = new ArrayList<>();
        pizzeSelezionate.add(ctx.getBean("margherita", Pizze.class));
        pizzeSelezionate.add(ctx.getBean("margherita", Pizze.class));
        pizzeSelezionate.add(ctx.getBean("funghiPizza", Pizze.class));

        List<Bevande> bevandeSelezionate = new ArrayList<>();
        bevandeSelezionate.add(ctx.getBean("coca", Bevande.class));
        bevandeSelezionate.add(ctx.getBean("acqua", Bevande.class));
        bevandeSelezionate.add(ctx.getBean("coca", Bevande.class));

        Ordini ordine = new Ordini(1, 3, tavolo, LocalDate.now(), pizzeSelezionate, bevandeSelezionate);

        menu.stampaMenu();
        ordine.stampaOrdine(coperto);
    }
}
