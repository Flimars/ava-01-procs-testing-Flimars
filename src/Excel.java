class Excel {


  static int columnNumber(String column){

    int result = 0;

    if (column.length() > 6 || column.length() < 1) {
      return 0;
    }

    for (int i = 0; i < column.length(); i++) {
      result *= 26;
      result += (column.charAt(i) - 'A') + 1;

    }
    return result;

  }

}
