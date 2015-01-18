import comp102x.IO;
public class PowerCalculator
{
    /**
     * Calculate the non-negative power of an integer number. If a negative power is input, the method returns 1.
     * 
     * @param number The number to take power.
     * @param power The power factor to be taken to.
     * @return The calculation result after taking power of the integer number.
     */
    public static long powerN(int number, int power) {
         int counter = 1;
         int answer = 1;
        if(power == 0){
            answer = 1;
        } else {
            while(counter <= power){
                //if all other cases
                answer = answer * number;
                counter = counter + 1;
            }
        }
        return answer;
    }
    public static int fact2(int n1, int n2) {  

    int t = 1; // initialize t to 1       
    for (int counter = n2; counter > n1; counter--) {
        t = t * counter;
    }
    return t;
    }
}
