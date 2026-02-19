public class FrequencyExample {

    public static void main(String[] args) {

        String input = "aabbccc";

        int[] freq = new int[26];   // array to store counts

        // Step 1: Count frequency
        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);   // get character
            int index = ch - 'a';        // convert to array index
            freq[index]++;               // increase count
        }

        // Step 2: Print result in original order
        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);
            int index = ch - 'a';

            if (freq[index] != 0) {      // print only once
                System.out.print(ch + "" + freq[index]);
                freq[index] = 0;         // avoid duplicate printing
            }
        }
    }
}
