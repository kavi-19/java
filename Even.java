import java.util.Scanner;


public class Even{
  public static void main(String[] args){
    int num = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the integer");
    num = sc.nextInt();
    for(int i=0;i<=num;i++){
      if(i%2==0){
        System.out.println(i+ " "+"is even");
      }
    }

  }
}