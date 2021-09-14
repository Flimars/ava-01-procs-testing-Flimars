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

    for (int i = 0; i < messageEncrypted.length(); i++) {
      text += (char) (messageEncrypted.charAt(i) - key);
    }
    return text;
  }







}
