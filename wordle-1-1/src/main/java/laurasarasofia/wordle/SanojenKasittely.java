package laurasarasofia.wordle;
import java.io.*;
//import javax.xml.*;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
//import java.lang.*;
import org.w3c.dom.NodeList;

public class SanojenKasittely {
    File file;



    public SanojenKasittely(File file){
        this.file=file;
    }

    public NodeList tiedostonKäsittely() throws ParserConfigurationException, SAXException, IOException{
        
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); 
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(file);
        doc.getDocumentElement().normalize();  //rivit 20-23 käsittelee sanat.xml tiedostoa käytettävään muotoon

        NodeList list = doc.getElementsByTagName("sana"); //muodostetaan NodeList lista sanat.xml sanoista
        //System.out.println("Root element :" + doc.getDocumentElement().getNodeName()); //Tulostaa juuren nimen (ei tarpeellinen toiminnan kannalta)
        return list;
    }

    public void tulostaSana () throws SAXException, IOException, ParserConfigurationException{

        NodeList lista = tiedostonKäsittely(); //kutsuu tiedostonKäsittely luokkaa saadakseen sanalistan NodeList muodossa

        int min = 0; 
        int max =lista.getLength(); //kertoo sanojen määrän
        int b = (int)(Math.random()*(max-min+1)+min);  //arpoo random numeron, jota käytetään sanalistasta random sanan valintaan
        System.out.println(lista.item(b).getTextContent());
    }

    public String getSana () throws ParserConfigurationException, SAXException, IOException{
        
        NodeList lista = tiedostonKäsittely(); //kutsuu tiedostonKäsittely luokkaa saadakseen sanalistan NodeList muodossa

        int min = 0; 
        int max =lista.getLength(); //kertoo sanojen määrän
        int b = (int)(Math.random()*(max-min+1)+min);  //arpoo random numeron, jota käytetään sanalistasta random sanan valintaan
        String sana = lista.item(b).getTextContent(); //muodostaa String muotoisen sanan random listan sanasta

        return sana; //palauttaa sanan
    }
    public boolean onkoListassa (String arvaus) throws ParserConfigurationException, SAXException, IOException{
        NodeList lista = tiedostonKäsittely();  //testaa onko arvattu sana listassa
        boolean onko=false;
        for(int i=0; i<lista.getLength(); i++){
            if(lista.item(i).getTextContent().equals(arvaus)==true){
                onko=true;
            }
        }
        return onko;
    }
}
