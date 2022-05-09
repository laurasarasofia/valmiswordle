package laurasarasofia.wordle;
public class Pelilauta {
    String sana;
    String vastaus; 
    String[][] lauta = new String[6][5];
    int kierros;
    PelinTila tila = new PelinTila();

    public Pelilauta(  String vastaus) {
        this.sana = sana;
        this.kierros = kierros;
        this.vastaus=vastaus;
        tila.tyhjaLauta(); //käytetään PelinTilan tyhjän laudan muodostukseen (laudan arvot ei ole null  vaan " ")
    }

    public String[][] muodostaLauta(int kierros, String sana) {


        String[] kirjaimet = new String[sana.length()]; //luodaan String lista arvauksen kirjaimille
        String[] arvaus = new String[5];


        for (int i = 0; i < sana.length(); i++) { //lisätään kirjaimet-listaan pelaajan arvauksen kirjaimet for-loopin avulla
            kirjaimet[i] = String.valueOf(sana.charAt(i));
        }
        for (int i = 0; i < 6; i++) { //muodostetaan tyhjä lauta
            for (int j = 0; j < 5; j++) {
                lauta[i][j] = " ";
            
            }
        }
        if (kierros == 0) {
            for (int i = 0; i < sana.length(); i++) { // arvaus yksi
                VertaaSanat testi = new VertaaSanat(sana, vastaus); //Luodaan VertaaSanat objekti
                boolean[] vertailuV =testi.vertaaLisaa(); //testataan onko arvauksen kirjaimia oikeilla paikoilla
                boolean[] vertailuK=testi.sisaltaakoKirjaimen(); //testataan onko arvauksessa oikeita kirjaimia
                if(vertailuV[i]==true){ //vertaa sanasta tehtyä listaa vertailu-listaan, ja kaikki vertailulistan true kirjaimet tulostetaan vihreänä
                    lauta[0][i] = Vari.GREEN + kirjaimet[i]+ Vari.RESET;
                    arvaus[i]= Vari.GREEN + kirjaimet[i]+ Vari.RESET; //luodaan arvauslista kirjaimista värikoodeineen

                }
                else if(vertailuK[i]==true){ // jos vastauksessa on arvauksen kirjaimia muutetaan ne keltaisiksi
                    lauta[0][i]=Vari.YELLOW + kirjaimet[i]+ Vari.RESET;
                    arvaus[i]=Vari.YELLOW + kirjaimet[i]+ Vari.RESET; //luodaan arvauslista kirjaimista värikoodeineen


                }else{
                    lauta[0][i]=kirjaimet[i];
                    arvaus[i]=kirjaimet[i]; //luodaan arvauslista kirjaimista 
                    
                }
            }tila.tallennaLautaan(arvaus, kierros); //lähetetään arvaus ja kierros PelinTila objektille tallennukseen
          
        }
        if(kierros==1){
            for (int i = 0; i < sana.length(); i++) { // arvaus kaksi
                VertaaSanat testi = new VertaaSanat(sana, vastaus);
                boolean[] vertailuV =testi.vertaaLisaa();
                boolean[] vertailuK=testi.sisaltaakoKirjaimen();
                if(vertailuV[i]==true){ //vertaa sanasta tehtyä listaa vertailu-listaan, ja kaikki vertailulistan true kirjaimet tulostetaan vihreänä
                    lauta[1][i] = Vari.GREEN + kirjaimet[i] + Vari.RESET;
                    arvaus[i]= Vari.GREEN + kirjaimet[i]+ Vari.RESET;

                }
                else if (vertailuK[i]==true){ //vertaa sanasta tehtyä listaa vertailu-listaan, ja kaikki vertailulistan true kirjaimet tulostetaan keltaisina
                    lauta[1][i]=Vari.YELLOW + kirjaimet[i]+ Vari.RESET;
                    arvaus[i]=Vari.YELLOW + kirjaimet[i]+ Vari.RESET;

                }
                else{
                    lauta[1][i]=kirjaimet[i];
                    arvaus[i]=kirjaimet[i];
                
                }
            }tila.tallennaLautaan(arvaus, kierros);
            

        }
        if(kierros==2){
            for (int i = 0; i < sana.length(); i++) { // arvaus kolme
                VertaaSanat testi = new VertaaSanat(sana, vastaus);
                boolean[] vertailuV =testi.vertaaLisaa();
                boolean[] vertailuK=testi.sisaltaakoKirjaimen();
                if(vertailuV[i]==true){ //vertaa sanasta tehtyä listaa vertailu-listaan, ja kaikki vertailulistan true kirjaimet tulostetaan vihreänä
                    lauta[2][i] = Vari.GREEN + kirjaimet[i]+ Vari.RESET;
                    arvaus[i]= Vari.GREEN + kirjaimet[i]+ Vari.RESET;
                }else if (vertailuK[i]==true){
                    lauta[2][i]=Vari.YELLOW + kirjaimet[i]+ Vari.RESET;
                    arvaus[i]=Vari.YELLOW + kirjaimet[i]+ Vari.RESET;
                }
                else{
                    lauta[2][i]=kirjaimet[i];
                    arvaus[i]=kirjaimet[i];
                }
            }tila.tallennaLautaan(arvaus, kierros);
        }
        if(kierros==3){
            for (int i = 0; i < sana.length(); i++) { // arvaus neljä
                VertaaSanat testi = new VertaaSanat(sana, vastaus);
                boolean[] vertailuV =testi.vertaaLisaa();
                boolean[] vertailuK=testi.sisaltaakoKirjaimen();
                if(vertailuV[i]==true){
                    lauta[3][i] = Vari.GREEN + kirjaimet[i]+ Vari.RESET;
                    arvaus[i]=Vari.GREEN + kirjaimet[i]+ Vari.RESET;
                }else if (vertailuK[i]==true){
                    lauta[3][i]=Vari.YELLOW + kirjaimet[i]+ Vari.RESET;
                    arvaus[i]=Vari.YELLOW + kirjaimet[i]+ Vari.RESET;
                }
                else{
                    lauta[3][i]=kirjaimet[i];
                    arvaus[i]=kirjaimet[i];
                }
            }tila.tallennaLautaan(arvaus, kierros);

        }
        if(kierros==4){
            for (int i = 0; i < sana.length(); i++) { // arvaus viisi
                VertaaSanat testi = new VertaaSanat(sana, vastaus);
                boolean[] vertailuV =testi.vertaaLisaa();
                boolean[] vertailuK=testi.sisaltaakoKirjaimen();
                if(vertailuV[i]==true){
                    lauta[4][i] = Vari.GREEN + kirjaimet[i]+ Vari.RESET;
                    arvaus[i]= Vari.GREEN + kirjaimet[i]+ Vari.RESET;
                
                }else if (vertailuK[i]==true){
                    lauta[4][i]=Vari.YELLOW + kirjaimet[i]+ Vari.RESET;
                    arvaus[i]=Vari.YELLOW + kirjaimet[i]+ Vari.RESET;
                }
                else{
                    lauta[4][i]=kirjaimet[i];
                    arvaus[i]=kirjaimet[i];
                }
            }tila.tallennaLautaan(arvaus, kierros);

        }
        if(kierros==5){
            for (int i = 0; i < sana.length(); i++) { // arvaus kuusi
                VertaaSanat testi = new VertaaSanat(sana, vastaus);
                boolean[] vertailuV =testi.vertaaLisaa();
                boolean[] vertailuK=testi.sisaltaakoKirjaimen();
                if(vertailuV[i]==true){
                    lauta[5][i] = Vari.GREEN + kirjaimet[i]+ Vari.RESET;
                    arvaus[i]= Vari.GREEN + kirjaimet[i]+ Vari.RESET;
                }
                else if (vertailuK[i]==true){
                    lauta[5][i]=Vari.YELLOW + kirjaimet[i]+ Vari.RESET;
                    arvaus[i]=Vari.YELLOW + kirjaimet[i]+ Vari.RESET;
                }
                else{
                    lauta[5][i]=kirjaimet[i];
                    arvaus[i]=kirjaimet[i];
                }
            }tila.tallennaLautaan(arvaus, kierros);

        }

        return lauta;

    }

}
