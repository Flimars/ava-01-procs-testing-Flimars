/**
 * Texto
 */

public class Texto {

// Laço de Repetição com while.
  // public static String pad(String umaString, int largura, char umCaractere){

  //   int preencher = (largura - umaString.length());
  //   int contador = preencher-2;

  //   while(contador < preencher || contador > preencher){
  //     if (contador < preencher) {
  //       umaString += umCaractere;
  //       contador++;
  //     } else {
  //       umaString += (preencher * umCaractere);
  //     }

  //   }
  //   return umaString;
  // }

// Laço de repetição com for i.
  public static String pad(String umaString, int largura, char umCaractere) {
    int preencher = largura - umaString.length();
    // Laço de repetição: umaString == largura.
    for (int i = 0; i < preencher; i++) {
      umaString += umCaractere;
    }
    return umaString;
  }

}


