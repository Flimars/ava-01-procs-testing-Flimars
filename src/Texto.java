/**
 * Texto
 */

public class Texto {

  public static String pad(String umaString, int largura, char umCaractere) {

    for (int i = umaString.length(); i < largura; i++) {
      umaString += umCaractere;
    }
    return umaString;
  }

}


