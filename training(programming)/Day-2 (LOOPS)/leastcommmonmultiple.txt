public class leastcommmonmultiple{
public static void main(string[] args){
Scanner sc = new scanner(System.in);
System.out.println("Enter 1st number");
int a=sc.nextInt();
System.out.println("Enter 2nd number");
int b=sc.nextInt();
System.out.println("Enter 3rd number");
int c=sc.nextInt();
getLCM(a,b,c);
}
public static void getLCM(int a, int b, int c){
int big=(a>b)?(a>c?a:c):(b>c?b:c);
for(int i=big;;i+=big){
if(i%a==0 && i%b==0 && i%c==0){
system.out.println("LCM is: "+);
break;
}
}
}
}