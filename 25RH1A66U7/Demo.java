class Demo
{
int x,y; 
Demo(int a,int b)
{
x=a;
y=b;
}
void display()
{
System.out.println("x="+x+"\t"+"y="+y);
}
public static void main(String[] args)
{
Demo d= new Demo(7,9);
d.display();
}}
