import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
          int N = scan.nextInt();
          if(N%2==1){//0DD
          System.out.println("Weird"); 
          }else{//EVEN
            if(2 <=N && N<=5){
                 System.out.println("Not Weird");   
            }else if(6 <=N && N<=20){
                System.out.println("Weird");
            }else if(N>20){
                System.out.println("Not Weird");   
            }
        }
    }
}
