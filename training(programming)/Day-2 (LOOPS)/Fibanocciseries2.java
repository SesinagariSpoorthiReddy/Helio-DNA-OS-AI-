public class Fibonacciseries2{
public static void main(String[] args){
int n = 10;
int a = 0;
int b = 1;
int count = 0;
System.out.println("Fibonacci Series up to " + n + " terms:");
while (count < n){
System.out.print(a + " ");
int nextTerm = a + b;
a = b;
b = nextTerm;
count++;
}
}
}