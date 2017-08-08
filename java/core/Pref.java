import java.util.prefs.Preferences;

public class Pref {
    public static void main(String[] args) {
        Preferences root = Preferences.systemRoot();
        Preferences node = root.node("learn.java.core");
        //node.put("name", "me");
        //node.putInt("age", 23); //need check file write permission
        System.out.println(node.get("name", "def"));
        System.out.println(node.getInt("age", 0));
    }
}