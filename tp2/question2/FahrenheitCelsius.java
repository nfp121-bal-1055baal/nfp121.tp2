    package question2;
    
    
    /**
     * Décrivez votre classe FahrenheitCelsius ici.
     * 
     * @author (votre nom) 
     * @version (un numéro de version ou une date)
     */
    public class FahrenheitCelsius{
    
         /** le point d'entrée de cette application, 
          * dont le commentaire est à compléter
          *
          *  @param args ...
          */
         public static void main(String[] args){
            
               for(int i=0;i<args.length;i++){
                  int fahrenheit=0;
                  try{
                      fahrenheit = Integer.parseInt(args[i]);
                      float celsius = ((int)(fahrenheitEnCelsius(fahrenheit)*10))/10.0F;
                      System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
                  }catch(NumberFormatException nfe){
                      System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
                      
                  } 
                  
               }
            
               
         }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       // ...
       return (f-32)*((float)(5/9.0));  // à compléter  en remplaçant la valeur retournée par la fonction de conversion
       // ...
     }

}
