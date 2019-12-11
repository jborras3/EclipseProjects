import java.util.*;

public class Baraja{

    int size = 48;
    Cartes[] cartes = new Cartes[size];
    // Constructor
    public Baraja() {

        int n = 0;
        int i = 1;
        
        // En aquest bucle construeixo la baralla. 
        
            for(i = 1; i <= size/4; i++ ){
                cartes[n] = new Cartes("Oro", i);
                n++;
            }
            for(i = 1; i <= size/4; i++ ){
                cartes[n] = new Cartes("Espadas", i);
                n++;
            }
            for(i = 1; i <= size/4; i++ ){
                cartes[n] = new Cartes("Bastos", i);
                n++;
            }
            for(i = 1; i <= size/4; i++ ){
                cartes[n] = new Cartes("Copas", i);
                n++;
            }
                
    }

    public void mostrarBaraja() {
        for (int z = 0; z < size ; z++) {
            cartes[z].mostraC();
        }
    }

}