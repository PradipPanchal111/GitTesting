import java.util.HashMap;
import java.util.Scanner;

class duplicateTransaction {
  public static void main(String[] args) {
    // Create object of scanner to get the user's input
    Scanner sc = new Scanner(System.in);

    HashMap<String, String> hm = new HashMap<>();
    // A_B_10 2min
    //
    //
    //
    //

    for (int i = 0; i < 3; i++) {
      String sender = sc.next(); // A
      String receiver = sc.next(); // B
      String amount = sc.next(); // 10
      String timestamp = sc.next(); // 2min

      String key = sender + "-" + receiver + "-" + amount; // A_B_10
      // A_B_10 2min
      if (hm.containsKey(key)) {
        if (hm.get(key).equals(timestamp)) // 2min .equals(2min)
        {
          System.out.println("Duplicate detected");
        }

      } else {
        hm.put(key, timestamp);
      }

    }

  }
}
