class demo {
  public boolean isPrime(int no) {
    if (no <= 1) {
      return false;
    }
    for (int i = 2; i < no / 2; i++) {
      if (no / i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

  }
}