
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






public class Main {
    public static void main(String[] args) {
        String[] arrays = { " Words : "  + " ------> " + "dk", "ac", "kd", "ca", "zz", "df", "fd", "wer", "rew"};
        int count = countPairs(arrays);
        System.out.println("Pairslar soni   : -------->  " + count);
    }

    // arraydagi har bitta stringni  solishtirb ciqdm birinchi
    public static boolean methodArraysString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(s2.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static int countPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (methodArraysString(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }
}



public class Main {
    public static void main(String[] args) {

    CustomDoublyLinkedList <Integer>  customDoublyLinkedList = new CustomDoublyLinkedList<Integer>();
    customDoublyLinkedList.add(12);
    customDoublyLinkedList.add(2);
    customDoublyLinkedList.add(3);
    customDoublyLinkedList.add(5);
    System.out.println(customDoublyLinkedList.toString());

    customDoublyLinkedList.remove(2);
    System.out.println(customDoublyLinkedList.toString());

    customDoublyLinkedList.get(3);
    System.out.println(customDoublyLinkedList.toString());
    customDoublyLinkedList.get2(0);
        System.out.println(customDoublyLinkedList);
        customDoublyLinkedList.contains(7);
    System.out.println(customDoublyLinkedList);
    }

}


