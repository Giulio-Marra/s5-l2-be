package giulio.marra.giulio_marra.entities;

import java.time.LocalDate;
import java.util.List;


public class Ordini {

    private int numeroOrdine;
    private int numeroCoperti;
    private Tavoli tavolo;
    private LocalDate dataAcquisizione;
    private List<Pizze> pizzeOrdinate;
    private List<Bevande> bevandeOrdinate;
    private List<Ingredienti> ingredientiOrdinati;

    public Ordini(int numeroOrdine, int numeroCoperti, Tavoli tavolo, LocalDate dataAcquisizione, List<Pizze> pizzeOrdinate, List<Bevande> bevandeOrdinate, List<Ingredienti> ingredientiOrdinati) {
        this.numeroOrdine = numeroOrdine;
        this.numeroCoperti = numeroCoperti;
        this.tavolo = tavolo;
        this.dataAcquisizione = dataAcquisizione;
        this.pizzeOrdinate = pizzeOrdinate;
        this.bevandeOrdinate = bevandeOrdinate;
        this.ingredientiOrdinati = ingredientiOrdinati;
    }

    public void stampaOrdine() {
        System.out.println("Ordine:");
        System.out.println("Pizze ordinate:");
        for (Pizze pizza : pizzeOrdinate) {
            System.out.println(pizza);
        }
        System.out.println("Bevande ordinate:");
        for (Bevande bevanda : bevandeOrdinate) {
            System.out.println(bevanda);
        }

    }


}
