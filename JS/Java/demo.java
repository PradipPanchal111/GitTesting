package Java;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;

class demo {
  public static void main(String[] args) {

    // Create hashmap
    HashMap<String, String> hm = new HashMap<>();

    // Add values in Hashmap
    hm.put("1", "One");
    hm.put("2", "One");
    hm.put("3", "One");

    // Print value of key "1"
    System.out.println(hm.get("1"));

    // Print all keys
    System.out.println(hm.keySet().getClass().getName());
    String key = "lhf";
    System.out.println(key.getClass().getSimpleName());

    // Create Hashset and put all keys of Hashmap using "keySet() Function"
    HashSet<String> hs = new HashSet<>(hm.keySet());

    // Use foreach loop to print all values
    for (Object object : hs) {
      System.out.println(object);
    }
  }
}