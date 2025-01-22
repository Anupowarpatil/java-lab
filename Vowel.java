public class Vowel {
    public static void main(String[] args) {
        int i = 0;
        String[] str1 = { "Prajwal", " Purva", "Sonali", "Yash" };
        for (i = 0; i < str1.length; i++) {
            if (str1[i].charAt(str1[i].length() - 1) == 'a') {
                System.out.print(str1[i] + " ");
            }
            if (str1[i].charAt(str1[i].length() - 1) == 'e') {
                System.out.print(str1[i] + " ");
            }
            if (str1[i].charAt(str1[i].length() - 1) == 'i') {
                System.out.print(str1[i] + " ");
            }
            if (str1[i].charAt(str1[i].length() - 1) == 'o') {
                System.out.print(str1[i] + " ");
            }
            if (str1[i].charAt(str1[i].length() - 1) == 'u') {
                System.out.print(str1[i] + " ");
            }
        }
    }
}
