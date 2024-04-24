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

