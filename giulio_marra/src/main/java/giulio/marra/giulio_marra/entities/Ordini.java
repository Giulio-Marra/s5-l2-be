package giulio.marra.giulio_marra.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ordini {

    private int numeroOrdine;
    private int numeroCoperti;
    private Tavoli tavolo;
    private LocalDate dataAcquisizione;
    private List<Pizze> pizzeOrdinate;
    private List<Bevande> bevandeOrdinate;
    private List<Ingredienti> ingredientiOrdinati;

    public Ordini() {
        this.pizzeOrdinate = new ArrayList<>();
        this.bevandeOrdinate = new ArrayList<>();
        this.ingredientiOrdinati = new ArrayList<>();
    }

    // Methods to add ordered items
    public void aggiungiPizza(Pizze pizza) {
        pizzeOrdinate.add(pizza);
    }

    public void aggiungiBevanda(Bevande bevanda) {
        bevandeOrdinate.add(bevanda);
    }

    public void aggiungiIngrediente(Ingredienti ingrediente) {
        ingredientiOrdinati.add(ingrediente);
    }

    // Getters for ordered items
    public List<Pizze> getPizzeOrdinate() {
        return pizzeOrdinate;
    }

    public List<Bevande> getBevandeOrdinate() {
        return bevandeOrdinate;
    }

    public List<Ingredienti> getIngredientiOrdinati() {
        return ingredientiOrdinati;
    }

}
