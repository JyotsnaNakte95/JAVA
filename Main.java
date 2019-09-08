import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

public class Main {
  public static void main(String args[]) {

    Hashtable<String, String> h = new Hashtable<String, String>();
    h.put("a", "b");
    h.put("e", "d");
    h.put("c", "f");

    for (String str : h.keySet()) {
      System.out.println(str);
    }
    List<String> v = new ArrayList<String>(h.keySet());
    Collections.sort(v);

    for (String str : v) {
      System.out.println(str + " " + (String) h.get(str));
    }
  }
}
