class Matematica {
  // IMPLEMENTE!

  public static int resto(int dividendo, int divisor) {
    int resto;
    int quociente;
    if (dividendo > divisor) {
      quociente = dividendo / divisor;
      resto = dividendo - (quociente * divisor);

    } else {
      resto = 0;
    }
    return resto;
  }

}
