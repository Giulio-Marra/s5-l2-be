package giulio.marra.giulio_marra.entities;

import giulio.marra.giulio_marra.enums.StatoTavolo;

public class Tavoli {

    private int numeroTavolo;
    private int numeroCoperti;
    private StatoTavolo statoTavolo;

    public Tavoli(int numeroTavolo, int numeroCoperti, StatoTavolo statoTavolo) {
        this.numeroTavolo = numeroTavolo;
        this.numeroCoperti = numeroCoperti;
        this.statoTavolo = statoTavolo;
    }

    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    public int getNumeroCoperti() {
        return numeroCoperti;
    }

    public void setNumeroCoperti(int numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }

    public StatoTavolo getStatoTavolo() {
        return statoTavolo;
    }

    public void setStatoTavolo(StatoTavolo statoTavolo) {
        this.statoTavolo = statoTavolo;
    }

    @Override
    public String toString() {
        return "Tavoli{" +
                "numeroTavolo=" + numeroTavolo +
                ", numeroCoperti=" + numeroCoperti +
                ", statoTavolo=" + statoTavolo +
                '}';
    }
}
