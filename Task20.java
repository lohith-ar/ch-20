

public class Task20{
    public static void main(String[] args) {
        Task20.fibonacci(13);
        
    }


    public static int fibonacci(int n) {
        if(n<1) {
            return 0;
        }
        int sum = 0;
        
        int a = 1;
        int b = 1;


        for (int i=0;i<n;i++) {
            System.out.println(sum+" ");
            a = sum;
            sum+=b;
            b=a;
        }

        return sum ;
    }
}