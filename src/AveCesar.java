class AveCesar {

  static String encrypt(String text, int key){
    String messageEncryted = "";


    for (int i = 0; i < text.length(); i++) {
      messageEncryted += (char)(text.charAt(i) + key);
    }
    return messageEncryted;
  }

  static String decrypt(String messageEncrypted, int key) {
    String text = "";
    messageEncrypted = messageEncrypted.toUpperCase();

    if (messageEncrypted.length() > 50) {
      System.out.println("Ultapassa o limite de 50 caracteres!");
      return messageEncrypted = "";
    }

    if (key < 0 || key > 25 || key == 0) {
      return messageEncrypted;
    }


    for (int i = 0; i < messageEncrypted.length(); i++) {
      text += (char) (messageEncrypted.charAt(i) - key);
    }
    return text;
  }







}
