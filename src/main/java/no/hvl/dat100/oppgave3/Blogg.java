package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {
    Innlegg[] innleggtabell;
    int nesteledig;


	public Blogg() {
        innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
        innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
        int pos = 0;
        int count = 0;
        while (pos < innleggtabell.length) {
            if (innleggtabell[pos] != null) {
                count += 1;
            }
            pos++;
        }
        return count;
	}
	
	public Innlegg[] getSamling() {
        return innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
        int pos = 0;
        boolean funnet = false;

        while (pos < innleggtabell.length && !funnet){
            for (Innlegg tabell : innleggtabell) {
                if (tabell.getId() == innlegg.getId()) {
                    funnet = true;
                }
                pos++;
            }
        }
        return pos;
	}

	public boolean finnes(Innlegg innlegg) {
        int pos = 0;
        boolean funnet = false;

        while (pos < innleggtabell.length && !funnet){
            for (Innlegg tabell : innleggtabell) {
                if (tabell.getId() == innlegg.getId()) {
                    funnet = true;
                }
                pos++;
            }
        }
        return funnet;
	}

	public boolean ledigPlass() {
		boolean ledig = false;
        int pos = 0;

        while (pos < innleggtabell.length && !ledig){
            for (pos = 0; pos < innleggtabell.length; pos++) {
                if (innleggtabell[pos] == null) {
                    ledig = true;
                }
            }
            ledig = false;
        }

        return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {
        int pos = 0;
        boolean funnet = false;

        while (pos < innleggtabell.length && !funnet){
            for (Innlegg tabell : innleggtabell) {
                if (tabell.getId() != innlegg.getId()) {
                    innleggtabell[nesteledig] = innleggtabell[pos];
                }
                pos++;
            }
        }
        return funnet;
	}
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
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