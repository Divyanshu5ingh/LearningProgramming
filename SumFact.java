public class SumFact
{
    public static void main(String[] args)
    {
       int arr[] = {1,2,3,4,5};
       int ans = 0;
       int count = 1;
       for (int i = 0; i<arr.length; i++)
       {
           ans = ans+arr[i];
           count = count*arr[i];
       }
       System.out.println("The sum of the array is:: "+ans);
       System.out.println("The factorial of this array is::"+count);
    }
}