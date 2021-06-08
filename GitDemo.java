/*****
 * Divya Rallapalli
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
        double result;
        result = num + previousNumber;
        
        System.out.print("Add num to previousNumber");
        return result;
    }
    
    /*****
     * Description of function goes here
     *
     * @param - description of passed in arguments go here
     * @return - description of return value goes here
     *****/
    public double templateFunction(int num) {
        double latestNumber = 1;
        
        for (int j = 1; j <= num; ++j) {
            latestNumber = latestNumber * j;
        
    }
        return latestNumber;
}
