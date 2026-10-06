import java.util.Scanner;
public class AutomorphicNumber2{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a Number: ");
int n = sc.nextInt();
int square = n * n;
boolean isAutomorphic = String.valueOf(square).endsWith(String.valueOf(n));
if(isAutomorphic){
System.out.println("is is Automorphic");
}else{
System.out.println("is is not a Automorphic");
}
}
}