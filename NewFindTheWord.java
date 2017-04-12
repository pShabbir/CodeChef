import java.util.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] inputs = new String[n];
        for(int i = 0; i < n; i++) {
            inputs[i] = scan.nextLine();
        }

        int q = Integer.parseInt(scan.nextLine());


        int occurrences;


        while(q-- > 0) {


            String subword = scan.next();

            occurrences = 0;

            Pattern p = Pattern.compile("\\w" + subword + "\\w");


            for(String sentence : inputs) {
                Matcher m = p.matcher(sentence);
                while(m.find()) {
                    occurrences++;
                }
            }


            System.out.println(occurrences);
        }
        scan.close();
    }
}
