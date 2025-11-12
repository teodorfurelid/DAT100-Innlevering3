package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {
    Innlegg[] innleggtabell;
    int antall;


	public Blogg() {
        innleggtabell = new Innlegg[20];
        antall = 0;

	}

	public Blogg(int lengde) {
        innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
        int count = 0;
        for (int i = 0; i < antall; i++) {
            if (innleggtabell[i] != null) {
                count++;
            }
        }
        return count;
	}
	
	public Innlegg[] getSamling() {
        return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
        boolean funnet = false;
        int pos = 0;
        int sum = -1;

        while (!funnet && pos < antall) {
            if (innleggtabell[pos].getId() == innlegg.getId()) {
                sum = pos;
                funnet = true;
            }
            pos++;

        }
        return sum;
    }

	public boolean finnes(Innlegg innlegg) {
        boolean funnet = false;
        int i = 0;

        for (int pos = 0; pos < antall; pos++) {
            if (innleggtabell[pos].erLik(innlegg)) {
                funnet = true;
            }
        }
        return funnet;
	}

	public boolean ledigPlass() {
        int i = 0;
        boolean ledig = false;
        while (!ledig && i < innleggtabell.length) {
            if (innleggtabell[i] == null) {
                ledig = true;
            }
            i++;
        }
        return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {
        boolean lagttil = false;

        if (antall <= innleggtabell.length && innleggtabell[antall] == null && !lagttil) {
            innleggtabell[antall] = innlegg;
            antall++;
            lagttil = true;
        }

        return lagttil;

	}
	
	public String toString() {
        String s = "";
        for (int i = 0; i < antall; i++){
            s = innleggtabell[i].toString();
        }
        return s;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}