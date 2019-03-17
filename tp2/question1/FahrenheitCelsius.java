package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @Antonio Semaan (votre nom)
 * @1.0 (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

	/**
	 * le point d'entr�e de cette application, dont le commentaire est �
	 * compl�ter
	 * 
	 * @param args
	 *            ...
	 */
	public static void main(String[] args) {
		// pour tous les param�tres de la ligne de commande
		for(int i=0;i<args.length;i++){
		
		    int fahrenheit = Integer.parseInt(args[i]);
		    float celsius = ((int)(fahrenheitEnCelsius(fahrenheit)*10))/10.0F;
		    System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                }																		// format
																				// impos�s
																				
	}

	/**
	 * la m�thode � compl�ter.
	 * 
	 * @param f
	 *            la valeur en degr� Fahrenheit
	 * @return la conversion en degr� Celsius
	 */
	public static float fahrenheitEnCelsius(int f) {

		return (f-32)*((float)(5/9.0)); // � compl�ter en rempla�ant ce return 0.F par la fonction
					// de conversion
	}

}
