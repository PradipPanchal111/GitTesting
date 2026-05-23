class demo {
  public String convert(String s, int numRows) {
    String res = "";
    for (int i = 1; i <= numRows; i++) {
      for (int j = i - 1; j < s.length(); j += numRows + 1) {
        res += s.charAt(j);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    demo d = new demo();

    System.out.println(d.convert("PAYPALISHIRING", 3));
  }
}