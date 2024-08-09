public class Armstrong {

    public static void main(String[] args) {

        int number = 153, temp, remainder, result = 0, n = 0;

        temp = number;

        for (;temp!= 0; temp /= 10, ++n);
    
        temp = number;

        for (;temp != 0; temp /= 10)
        {
            remainder = temp % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}