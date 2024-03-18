
/**
 * Write a description of class Ex_7_7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class Ex_7_7
{
    public static void main() {
        
        main(null);
        
    }
    public static void main(String[] args) {
        
        String test = "abcdefga";
        
        int[] letterHistogram = letterHist(test);
        
        System.out.println(Arrays.toString(letterHistogram));
        
    }
    public static int[] letterHist(String input) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String input_lowercase = input.toLowerCase();
        int[] histogram = new int[26];
        for (int i = 0; i < input_lowercase.length(); i++) {
            
            for (int j = 0; j < alphabet.length(); j++){
                
            if(alphabet.charAt(j) == input_lowercase.charAt(i)) {
                
                histogram[j]++;
                
            }
                
            }
            
        }
        return histogram;
    }
}
