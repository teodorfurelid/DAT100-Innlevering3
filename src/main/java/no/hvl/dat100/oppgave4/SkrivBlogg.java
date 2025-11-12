package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.Innlegg;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        PrintWriter writer = null;
        try {
            // Oppretter full filsti
            String filsti = mappe + "/" + filnavn;
            writer = new PrintWriter(filsti);

            // Skriver bloggen til fil ved å bruke toString()-metoden
            writer.print(samling.toString());

            return true;

        } catch (FileNotFoundException e) {
            System.out.println("Feil ved skriving til fil: " + e.getMessage());
            return false;
        } finally {
            // Lukk PrintWriter uansett utfallet
            if (writer != null) {
                writer.close();
            }
        }
    }
}
