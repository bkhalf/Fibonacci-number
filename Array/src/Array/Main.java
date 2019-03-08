package Array;


import static Array.myarray.moveValue;

public class Main {


    public static void main(String[] args) {

        int []ar={1,2,3,4,5,6,5,5,7,7};
        int []ss=new int [2];

     //   myarray.reverse(ar);
        ss=myarray.sumEvenOdd(ar);
        System.out.println(ss[0]+" "+ss[1]);
        System.out.println(myarray.average(ar));
        myarray.moveValue(ar,5);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
