package laurasarasofia.wordle;
public class PelinTila {
    String[][]lauta = new String [6][5];

    public void tyhjaLauta(){ //muodostaa pelilaudan, jossa null sijasta on " "
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                this.lauta[i][j] = " ";
            
            }
        }
    }

    public void tallennaLautaan(String [] arvaus, int kierros){ //tallentaa edellisessä metodissa luotuun lautaan sille parametrinä
                             //annetun Stringlistan ja tulostaa pelilaudan
        this.lauta[kierros]=arvaus;
        
        tulostaLauta();
    }

    public void tulostaLauta() { //tulostaa pelilaudan indekseittäin


        System.out.println(lauta[0][0] + "|" + lauta[0][1] + "|" + lauta[0][2] + "|" + lauta[0][3] + "|" + lauta[0][4]);
        System.out.println("---------");
        System.out.println(lauta[1][0] + "|" + lauta[1][1] + "|" + lauta[1][2] + "|" + lauta[1][3] + "|" + lauta[1][4]);
        System.out.println("---------");
        System.out.println(lauta[2][0] + "|" + lauta[2][1] + "|" + lauta[2][2] + "|" + lauta[2][3] + "|" + lauta[2][4]);
        System.out.println("---------");
        System.out.println(lauta[3][0] + "|" + lauta[3][1] + "|" + lauta[3][2] + "|" + lauta[3][3] + "|" + lauta[3][4]);
        System.out.println("---------");
        System.out.println(lauta[4][0] + "|" + lauta[4][1] + "|" + lauta[4][2] + "|" + lauta[4][3] + "|" + lauta[4][4]);
        System.out.println("---------");
        System.out.println(lauta[5][0] + "|" + lauta[5][1] + "|" + lauta[5][2] + "|" + lauta[5][3] + "|" + lauta[5][4]);
        System.out.println("---------");
    }




}
