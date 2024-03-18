
/**
 * Example 6_4 from the Think Java textbook with
 * additional stipulations from Prof. Miller.
 * 
 *
 * @author Jamie Kemman
 * @version V1.0
 */
public class Example_6_4
{
    
    //Abecedarian method
    public static boolean isAbecedarian (String input) {
        
        //variable declaration
        boolean continue_flag = true;
        boolean answer = false;
        String compare_previous_iteration = "";
        String compare_current_iteration;
        int comparison_difference;
        int order_OK_counter = 0;
        
        try{ //in case of exceptions
            
        for (int iteration = 0; iteration < input.length(); iteration++) { //main loop
            
            if (continue_flag == true && (Character.isAlphabetic(input.charAt(iteration)) //checks if necessary to continue
                                        || Character.isAlphabetic(input.charAt(iteration+1))))  { //and filters for alphabetical characters only
                                            
                compare_current_iteration = input.substring(iteration,iteration+1);
                comparison_difference = compare_current_iteration.compareTo(compare_previous_iteration);
                //compares current and previous character. the first character will always be compared to an empty string.
                
                if (comparison_difference >= 0) {
                    
                    compare_previous_iteration = compare_current_iteration; //shifts active character to previous character after comparison.
                    ++order_OK_counter;
                }
                
                else {
                    
                    continue_flag = false; //if a string is found to be non-Abecedarian partway through comparison,comparison stops.
    
                    
                }
                
            }
            
        }
        
        if (order_OK_counter == input.length() && order_OK_counter != 0){ //checks if comparison was made for an entire, non-empty, string.
            
            answer = true;
            
        }

        
        return answer;
        
        }

    

        catch (Exception NullPointerException) {
        
            answer = false;
            return answer;
            }
        }
    
    
    
    //Main method
    public static void main () {
        
        //true examples
        String true_ex_1 = "abdest";
        boolean tresult_ex_1 = isAbecedarian(true_ex_1);
        System.out.printf("\nResult for 'abdest': %b\n", tresult_ex_1);
        
        String true_ex_2 = "adipsy";
        boolean tresult_ex_2 = isAbecedarian(true_ex_2);
        System.out.printf("Result for 'adipsy': %b\n", tresult_ex_2);
        
        String true_ex_3 = "diluvy";
        boolean tresult_ex_3 = isAbecedarian(true_ex_3);
        System.out.printf("Result for 'diluvy': %b\n", tresult_ex_3);
        
        //false examples
        String false_ex_1 = "tsedba";
        boolean fresult_ex_1 = isAbecedarian(false_ex_1);
        System.out.printf("Result for 'tsedba': %b\n", fresult_ex_1);
        
        String false_ex_2 = "querty";
        boolean fresult_ex_2 = isAbecedarian(false_ex_2);
        System.out.printf("Result for 'querty': %b\n", fresult_ex_2);
        
        String false_ex_3 = "hotdog";
        boolean fresult_ex_3 = isAbecedarian(false_ex_3);
        System.out.printf("Result for 'hotdog': %b\n", fresult_ex_3);
        
        //edge cases
        String edge1 = "123";
        boolean eresult_ex_1 = isAbecedarian(edge1);
        System.out.printf("Result for '123': %b\n", eresult_ex_1);
        
        String edge2 = ":-)";
        boolean eresult_ex_2 = isAbecedarian(edge2);
        System.out.printf("Result for ':-)': %b\n", eresult_ex_2);
        
        String edge3 = "";
        boolean eresult_ex_3 = isAbecedarian(edge3);
        System.out.printf("Result for '' (blank string): %b\n", eresult_ex_3);
        
        String edge4 = null;
        boolean eresult_ex_4 = isAbecedarian(edge4);
        System.out.printf("Result for 'null' (null value): %b\n", eresult_ex_4);
        
    }
    
    
}
