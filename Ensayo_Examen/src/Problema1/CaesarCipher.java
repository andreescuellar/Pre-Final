package Problema1;
/**
*
* @author Andrés Cuéllar
*/
public class CaesarCipher {

	public String cifrarCesar(String frase, int distancia) {
		String s = "";
	    int len = frase.length();
	    
	    for(int x = 0; x < len; x++){
	        char c = (char)(frase.charAt(x) + distancia);
	        
	        if (c > 'z') {
	            s += (char)(frase.charAt(x) - (27-distancia));
	        }else {
	            s += (char)(frase.charAt(x) + distancia);
	        }
	        
	        if (c > 'Z') {
	            s += (char)(frase.charAt(x) - (27-distancia));
	        }else {
	            s += (char)(frase.charAt(x) + distancia);
	        }
	    }
	    return s.toString();
	}
	
	public String cifrarCesar(String frase, String alfabeto, int distancia) {
    	StringBuilder cipher = new StringBuilder();
        distancia = distancia % alfabeto.length();
        for (int y = 0; y < frase.length(); y++) {
            if (frase.charAt(y) >= alfabeto.charAt(0) && frase.charAt(y) <= alfabeto.charAt(alfabeto.length()-1)) {
                if ((frase.charAt(y) + distancia) > 'z') {
                	cipher.append((char) (frase.charAt(y) + distancia - alfabeto.length()));
                } else {
                	cipher.append((char) (frase.charAt(y) + distancia));
                }
            } else if (frase.charAt(y) >= alfabeto.charAt(0) && frase.charAt(y) <= alfabeto.charAt(alfabeto.length()-1)) {
                if ((frase.charAt(y) + distancia) > 'Z') {
                	cipher.append((char) (frase.charAt(y) + distancia - alfabeto.length()));
                } else {
                	cipher.append((char) (frase.charAt(y) + distancia));
                }
            }
        }
        return cipher.toString();
    }

	

}
