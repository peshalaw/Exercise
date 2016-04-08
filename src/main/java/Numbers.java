import java.util.Scanner;
/**
 * Created by peshala on 3/31/16.
 */
public class Numbers{
    public static String list;
    public static void sum(double arr[]){
        double sum=0;
        for (double anArr : arr) {
            sum += anArr;
        }
        System.out.print("Sum of your number list is "+sum);
        operate();
    }

    public static void odd(double arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]%2!=0 && arr[i]!=1){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        operate();
    }

    public static void even(double arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]%2==0 ){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        operate();
    }

    public static void max(double arr[]){
        double max=arr[0];
        for (double anArr : arr) {
            if (max < anArr) {
                max = anArr;
            }
        }
        System.out.print("Maximum value of the list is "+max);
        operate();
    }

    public static void min(double arr[]){
        double min=arr[0];
        for (double anArr : arr) {
            if (min > anArr) {
                min = anArr;
            }
        }
        System.out.print("Minimum value of the list is "+min);
        operate();
    }

    public static void fibonacci(int n){

        int fib=0;
        int fib1=1;
        int fib0=0;
        for(int i=0;i<=n;i++){
            if(i==0){fib=0;
            }else if (i==1){
                fib=1;
            }else if (i>1){
                fib=fib1+fib0;
                fib0=fib1;
                fib1=fib;
            }

        }
        System.out.println("Fibonachchi number of "+n+ " is "+fib);
    }

    public static void prime(double arr[]){
        String s="";
        for(double anArr:arr){
            int count=0;
            for(double i=2;i<anArr;i++){
                if(anArr%i==0){
                    count++;
                }
            }
            if (count==0) {
                s+=Double.toString(anArr)+" ";
            }
        }
        System.out.println(s);
        operate();
    }
    public static void input(){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number set as given in the example");
        System.out.println("Eg. 1,2,3.4,34,34");
        list=sc.nextLine();
        operate();


    }

    public static void operate(){
        Scanner sc= new Scanner(System.in);
        String arrl[]=list.split(",");
        double numlist[]=new double[arrl.length];
        for (int i=0;i<arrl.length;i++){
            numlist[i]=Double.parseDouble(arrl[i]);
        }
        System.out.println();
        System.out.println("Enter  1 for sum, 2 for find max, 3 for odd numbers, 4 for find minimum, 5 for even numbers, to end 10");
        String operation=sc.nextLine();
        int oper=Integer.parseInt(operation);
        if(oper==1){
            sum(numlist);
        }else if(oper==2){
            max(numlist);
        }else if(oper==3){
            odd(numlist);
        }else if(oper==4){
            min(numlist);
        }else if(oper==5){
            even(numlist);
        }else if(oper==6){
            fibonacci(Integer.parseInt(arrl[0]));
        }else if(oper==7){
            prime(numlist);
        }else if(oper==10){
            System.out.println("Thanks");
        }
    }

    public static void main(String args[]) throws Exception {
        //input();
        try {
            SortFromFile.sortNums();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
