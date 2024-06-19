package giulio.marra.giulio_marra.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizze {
    private String nome;
    private double prezzoBase;
    private List<Ingredienti> ingredienti = new ArrayList<>();

    public Pizze(String nome, double prezzoBase, List<Ingredienti> ingredienti) {
        this.nome = nome;
        this.prezzoBase = prezzoBase;
        this.ingredienti = ingredienti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzoBase() {
        return prezzoBase;
    }

    public void setPrezzoBase(double prezzoBase) {
        this.prezzoBase = prezzoBase;
    }

    public List<Ingredienti> getIngredientiAggiuntivi() {
        return ingredienti;
    }

    public void setIngredientiAggiuntivi(List<Ingredienti> ingredienti) {
        this.ingredienti = ingredienti;
    }

    @Override
    public String toString() {
        return "Pizze{" +
                "nome='" + nome + '\'' +
                ", prezzoBase=" + prezzoBase +
                ", ingredienti=" + ingredienti +
                '}';
    }
}
