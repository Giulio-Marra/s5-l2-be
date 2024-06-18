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


}
