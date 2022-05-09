package laurasarasofia.wordle;
import java.io.*;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

/**
 * Wordle
 */
public class Wordle {

    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {

        File myObj = new File("sanat.xml"); // Luo File muotoisen tiedoston
        SanojenKasittely sanalista = new SanojenKasittely(myObj); // Luo SanojenKäsittely objektin sanalista jonka
                                                                  // attribuuttina on myObj

        Scanner lukija = new Scanner(System.in); // Luodaan lukija Scanner käsittelemään pelaajan syöte

        String vastaus = sanalista.getSana(); // haetaan sanalistasta vastaus
        Pelilauta lauta = new Pelilauta(vastaus); // luodaan uusi Pelilauta lauta, jonka attribuuttina on pelin vastaus

        for (int i = 0; i < 6; i++) { // for-loopissa käydään pelinrakenne
            System.out.println("Kierros " + (i + 1) + " Arvaa 5-kirjaiminen sana: ");
            String arvaus = lukija.nextLine(); // kysytään lukijalta 5-kirjaiminen sana ja tallenetaan se String arvaus
            if (sanalista.onkoListassa(arvaus) == true) { // testataan onko arvaus sanalistassa
                lauta.muodostaLauta(i, arvaus); // käyteään Pelilauta luokan metodia ja annetaan attribuuteiksi kierros
                                                // ja arvattu sana

                VertaaSanat testi = new VertaaSanat(arvaus, vastaus); // luodaan VertaaSanat objekti, jossa testataan
                                                                      // onko arvaus ja vastaus sama
                if (testi.vertaa() == true) { // jos ovat samat peli päättyyy
                    i = 6;
                    System.out.println("Arvasit oikein!");
                } else if (i < 5) { // jos kierroksia on jäljellä peli jatkuu
                    continue;
                } else {
                    System.out.println("Arvaukset loppu! oikea vastaus: " + Vari.CYAN + vastaus + Vari.RESET); // jos
                                                                                                               // kierroksia
                                                                                                               // ei ole
                                                                                                               // jäljellä
                    break; // tulostetaan vastaus ja lopetetaan ohjelma
                }
            } else {
                System.out.println("Arvaus ei ole listassa."); // jos sanaa ei löydy listasta tulostetaan...
                // break;
            }
        }

    }
}