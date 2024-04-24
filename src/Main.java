import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
        public static void main(String[] args) {

                Set<String> set = new HashSet<>();
                Set<String> set2 = new HashSet<>();
                Set<String> set3 = new HashSet<>();
                set.add("olma");
                set.add("behi");
                set.add("nok");
                set.add("tuxum");
                set.add("guruch");

                set2.add("behi");
                set2.add("nok");
                set2.add("test");
                set2.add("shaftoli");
                set2.add("tuxum");

                set3.add("susambl");
                set3.add("daraxt");
                set3.add("nok");
                set3.add("guruch");
                set3.add("olma");

                Set<String> result = mySet(set, set2, set3);
                System.out.println(result);
        }

        public static Set<String> mySet(Set<String> set, Set<String> set2, Set<String> set3) {
                Set<String> newSet = new HashSet<>();
                newSet.addAll(set);
                newSet.addAll(set2);
//                newSet.addAll(set3);
                for (String str : set3) {
                        if (!set.contains(str) && !set2.contains(str)) {
                               newSet.add(str);
                        }
                }

                return newSet;
        }
}





