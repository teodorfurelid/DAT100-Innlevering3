package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {

    private int id;
    private String bruker;
    private String dato;
    private int likes;

    public Innlegg() {

    }

    public Innlegg(int id, String bruker, String dato) {

        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
    }

    public Innlegg(int id, String bruker, String dato, int likes) {

        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;
    }

    public int getId() {
        return id;
    }

    public String getBruker() {
        return bruker;
    }

    public String getDato() {
        return dato;
    }

    public int getLikes() {
        return likes;
    }

    public void setId(int ny) {
        id = ny;
    }

    public void setBruker(String ny) {
        bruker = ny;
    }

    public void setDato(String ny) {
        dato = ny;
    }

    public void doLike () {
        this.likes += 1;
    }

    public boolean erLik(Innlegg innlegg) {
        boolean lik = false;
        int pos = 0;
        if (innlegg.getId() == this.id && !lik) {
            lik = true;
        }
        return lik;
    }

    @Override
    public String toString() {
        return id+"\n"+bruker+"\n"+dato+"\n"+likes+"\n";
    }


    // Metoden nedenfor er kun for valgfri oppgave 6
    public String toHTML() {

        throw new UnsupportedOperationException(TODO.method());

    }
}