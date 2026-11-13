public class Task8 {
    public static int cumulative(int... numbers){
        int total = 0;
        for (int num : numbers){
            int cumulativeSum = 0;
            for (int i = 1; i <= num; i++){
                cumulativeSum += i;
            }
            System.out.println(total += cumulativeSum);
        }
        return total;
    }
    


    public static void main (String[] args){
        int[] inputs = {4,5,10};
        System.out.println("parameter: ");
        for (int val : inputs){
        System.out.println(val + " ");
        
        }
        System.out.println("\n");
        int result = cumulative(inputs);

        System.out.println("Grand Total: " + result);
    }    
}
