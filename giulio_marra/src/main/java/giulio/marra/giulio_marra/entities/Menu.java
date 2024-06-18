package giulio.marra.giulio_marra.entities;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class Menu {


    private List<Pizze> pizze;
    private List<Bevande> bevande;
    private List<Ingredienti> ingredienti;

    public void stampaMenu() {
        System.out.println("Menu Pizze:");
        for (Pizze pizza : pizze) {
            System.out.println(pizza);
        }
        System.out.println("Menu Bevande:");
        for (Bevande bevanda : bevande) {
            System.out.println(bevanda);
        }
        System.out.println("Menu Ingredienti:");
        for (Ingredienti ingrediente : ingredienti) {
            System.out.println(ingrediente);
        }
    }
}
