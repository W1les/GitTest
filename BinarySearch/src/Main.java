public class Main {
    public static void main(String[] args) {
        int [] tab = {1,2,3,4,5,6,9,10,11,12,13,14,15,16,17,18,19,20};

        System.out.println( binarySearch(tab,15));

    }
    private static int binarySearch (int [] numbers, int numberToFind)
    {
        int low =0;
        int high =numbers.length-1;
        while(low<=high)
        {
            int middlePosition = (low+high)/2;
            int middleNumber = numbers[middlePosition];
            if (numberToFind==middleNumber)
            {
                return middlePosition;
            }
            if(numberToFind<middleNumber)
            {
                high=middlePosition-1;
            }
            else{
               low= middlePosition+1;
            }
        }
        return  -1;

    }
}