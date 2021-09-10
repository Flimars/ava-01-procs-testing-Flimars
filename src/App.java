class App {
  public static void main(String[] args) {
    System.out.println("Olá mundo!");

    // int dividendo = 5;
    // int divisor = 2;
    // int resto = Matematica.resto(dividendo, divisor);
    // // print:
    // // assertiva:
    // System.out.println(resto == 1); // Deve imprimir: true
    // System.out.println(resto); // Deve imprimir: 1
    // // mais assertivas: (devem imprimir true)
    // System.out.println(Matematica.resto(10, 4) == 2);
    // System.out.println(Matematica.resto(29, 5) == 4);
    // // adicione mais 3 casos de teste na forma de prints e assertivas
    // dividendo = 25;
    // divisor = 8;
    // // print:
    // System.out.println(resto); // Deve imprimir: 1
    // dividendo = 230;
    // divisor = 7;
    // // print:
    // System.out.println(resto); // Deve imprimir: 1
    // dividendo = 250;
    // divisor = 3;
    // System.out.println(resto); // Deve imprimir: 1
    // // assertivas: (devem imprimir true)
    // System.out.println(Matematica.resto(25, 8) == 1);
    // System.out.println(Matematica.resto(9, 3) == 0);
    // System.out.println(Matematica.resto(131, 10) == 1);
    // System.out.println("");
    System.out.println("---------- Exercício 2 ----------");
    //  ### Preencher String
    //  ```java
    String umaString = "tads"; // length 4
    int largura = 10; // length desejado
    char umCaractere = '!'; // preste atenção às aspas simples

    String resultado = Texto.pad(umaString, largura, umCaractere);

    // tads sucedido por 6 exclamações para alcançar length 10
    System.out.println(resultado); // Deve imprimir: tads!!!!!!

    // assertivas
    System.out.println(resultado.length() == 10); // Deve imprimir: true
    System.out.println(resultado.equals("tads!!!!!!")); // Deve imprimir: true

    System.out.println(Texto.pad("oi", 5, '*').equals("oi***")); // true

    // caso especial: length da string maior que a largura deixa inalterada
    System.out.println(Texto.pad("logica", 5, '*').equals("logica"));
    System.out.println(Texto.pad("logica", 5, '*').length() == 6);
    // string vazia, print:
    System.out.println(Texto.pad("", 8, '#')); // ########
    // assertiva
    System.out.println(Texto.pad("", 8, '#').equals("########")); // true

    // Adicione mais 3 casos de teste,
    // um deles para o caso especial de largura negativa:
    System.out.println(Texto.pad("Forca:", 10, '_')); // Forca:____
    System.out.println(Texto.pad("Forca:", 10, '_').equals("Forca:____")); // true
    // caso especial: length da string maior que a largura deixa inalterada
    System.out.println(Texto.pad("Forca:", -3, '.').equals("Forca:")); // true



  }
}
