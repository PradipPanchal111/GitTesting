package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class one {
  public static void main(String[] args) {
    String s = "aaabbcccc";
    List<Character> list = new ArrayList<>();
    for (char c : s.toCharArray()) {
      list.add(c);
    }
    Set<Character> set = new HashSet<>(list);
    StringBuffer sb = new StringBuffer();
    for (char c : set) {
      int freq = Collections.frequency(list, c);
      sb.append(c).append(freq);
    }
    System.out.println(sb.toString());
  }
}