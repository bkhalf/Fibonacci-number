package Array;

public class myarray {
    public static void reverse(int [] ar){
        int temp,i;
        for(i=0;i<ar.length/2;i++){
            temp=ar[i];
            ar[i]=ar[ar.length-1-i];
            ar[ar.length-1-i]=temp;
        }
    }

    public static int[] sumEvenOdd(int[] arr){
        int i;
        int[] sum=new int[2];
        for(i=0;i<arr.length;i++){
            if(arr[i]%2==0)sum[0]+=arr[i];
            else sum[1]+=arr[i];
        }
        return sum;
    }

    public static double average(int[] arr){
        int i,sum=0;
        for(i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }

    public static void moveValue(int[] arr, int val) {
        int i, j = 0, flag = 1, temp, count = 0;
        int n = arr.length;

        for (i = 0; i < n - 1; i++)
            for (j = 0; j < n - 1 - i; j++)
                if (arr[j] == val) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

}


