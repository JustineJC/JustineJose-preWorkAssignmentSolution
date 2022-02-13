import java.io.*;
import java.util.Scanner;
import java.lang.Runtime.*;
public class  UPAfebW4{
    
    //Function check pallindrome
    public void checkPalindrome(){
        int sum=0,rem,check;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        check = num;
        //loop to seperate the digits by 1,10,100 place
        while(num>0){
            rem = num % 10; //get the reminder ie the last digits
            sum = (sum * 10) + rem; // add the reminder to sum ie last is brought to begining
            num = num/10;           // divide the number ie seperate the digits
        }
        //checking if pallindrome or not
        if(check == sum)
        System.out.println("The number is PALLINDROME");
        else
        System.out.println("Its NOT a Pallindrome");
    }
    //Function to print pattern
    public void printPattern(){
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines of patterns needed:");
        size = sc.nextInt();
        for(int i=size;i>0;i--){
            for(int k=i;k<size;k++) //calculating the space
             System.out.printf("");
            for(int j=0;j<i;j++)
            System.out.printf("* ");
            System.out.println();
        }
    }
    //Function to find the prime number or composite
    public void checkPrimeNumber(){
        int count=0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=2;i<num;i++){
            if(num%i == 0) count++;
                    }
        var result = (count > 0)?"Number is Composite":"Number is Prime";
        System.out.println(result);            
    }
    //Function to print Fibonaci series
     public void printFibonacciSeries(){  
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first =0,second =1,series;
        System.out.printf(first+" "+second+" ");
        for(int i=2;i<n;i++){
            series = first + second;
            first = second;
            second = series;
            System.out.printf(series+" ");
        }
     } 
 public static void main(String[] args) {
     
     UPAfebW4 obj = new  UPAfebW4(); 
    Scanner sc = new Scanner(System.in);
    int choice;
    char gate;
    //Runtime ps = Runtime.getRuntime();
    do {
        //try{Process p = ps.exec("cls");}catch(IOException e){e.printStackTrace();}
         System.out.println("\n\n\t\t************************************************");
        System.out.println("\t\t||    #Enter your choice from below list#    ||\n" +"\t\t||-------------------------------------------||" +"\n\t\t||1. Find palindrome of number.              ||\n"
        
        + "\t\t||2. Print Pattern for a given no.           ||\n" + "\t\t||3. Check whether the no is a  prime number.||\n"
        
        + "\t\t||4. Print Fibonacci series.                 ||\n\t\t||                                           ||" + "\n\t\t||--> Enter 0 to Exit.                       ||");
        System.out.println("\t\t***********************************************");
        System.out.println();
        
        System.out.println("\nPlease enter you choice:"); 
        choice = sc.nextInt();
        switch (choice) {

 

            case 0:
            
            choice = 0;
            
            break;
            
             
            
            case 1: {
            
            obj.checkPalindrome();
            
            }
            
            break;
            
             
            
            case 2: {
            
             
            
            obj.printPattern();
            
            }
            
            break;
            
             
            
            case 3: {
            System.out.println("\nEnter a number to check wheather Prime or Composite\n");
            obj.checkPrimeNumber();
            
            }
            
            break;
            
             
            
            case 4: {
            
             System.out.println("Enter a number to calculate its Fibonacci series:");            
            obj.printFibonacciSeries();
            
            }
            
            break;
            
             
            
            default:
            
            System.out.println("Invalid choice. Enter a valid no.\n");
            
            }
            
             
            System.out.println("\n Do you wish to continue Y/N:");
            gate=sc.next().charAt(0);
            } while (gate == 'Y');
            System.out.println("\nExited Successfully!!!");

                     

}     
}
