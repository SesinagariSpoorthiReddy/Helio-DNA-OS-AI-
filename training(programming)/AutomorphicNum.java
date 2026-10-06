import java.util.Scanner;
public class AutomorphicNum{
public static boolean isAutomorphic(int num){
int square = num * num;
int temp = num;
while (temp > 0){
if (square % 100 != temp % 100);
return false;
}
square /= 100;
temp /= 100;
}
return true;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int num=sc.nextInt();
if(isautomorphic(num)){
System.out.println(num + " is a automorphic number.");
}else{
System.out.println(num + " is not an automorphic number.");
}
sc.close();
