package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @Antonio Semaan (votre nom)
 * @1.0 (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

	/**
	 * le point d'entrée de cette application, dont le commentaire est à
	 * compléter
	 * 
	 * @param args
	 *            ...
	 */
	public static void main(String[] args) {
		// pour tous les paramètres de la ligne de commande
		for(int i=0;i<args.length;i++){
		
		    int fahrenheit = Integer.parseInt(args[i]);
		    float celsius = ((int)(fahrenheitEnCelsius(fahrenheit)*10))/10.0F;
		    System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                }																		// format
																				// imposés
																				
	}

	/**
	 * la méthode à compléter.
	 * 
	 * @param f
	 *            la valeur en degré Fahrenheit
	 * @return la conversion en degré Celsius
	 */
	public static float fahrenheitEnCelsius(int f) {

		return (f-32)*((float)(5/9.0)); // à compléter en remplaçant ce return 0.F par la fonction
					// de conversion
	}

}
