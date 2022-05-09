package laurasarasofia.wordle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;  

 
  
public class EkaTesti {  
  
    @Test
    public void testVertailuEri(){
        String arvaus="katti";
        String vastaus="kissa";
        VertaaSanat sanat = new VertaaSanat(arvaus, vastaus);
        assertEquals(false, sanat.vertaa());
    }
    public void testVertailuSama(){
        String arvaus="kissa";
        String vastaus="kissa";
        VertaaSanat sanat = new VertaaSanat(arvaus, vastaus);
        assertEquals(true, sanat.vertaa());
    }
}  
