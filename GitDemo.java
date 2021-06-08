/*****
 * Edit this line to have your name.
 ******/
public class GitDemo {
    
    private double previousNumber;
    
    public GitDemo() {
        previousNumber = 1;
    }
    
    /*****
     * This function adds the given number to the private "previousNumber"
     * stored in the GitDemo class. 
     * 
     * @param num - A number that should be added to GitDemo:previousNumber
     * @return the updated value of 'previousNumber'
    *****/
    public double addNumber(double num) {
        System.out.print("Add num to previousNumber");
        return 0;
    }
    
    /*****
     * Description of function goes here
     *
     * @param - description of passed in arguments go here
     * @return - description of return value goes here
     *****/
    public double templateFunction(int num) {
        double factorialNumber = 0;
        
        while( num != 0) {
            double temp = num % 10;
            factorialNumber = factorialNumber * 10 + temp;
            num /= 10;

    }
        return factorialNumber;
}
