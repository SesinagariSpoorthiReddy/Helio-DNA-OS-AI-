class Animal
{
//variable
int age = 5;
float ht = 2.79f;
String name = "Snoopy";
//methods
void display()
{
System.out.println("Age= "+age);
System.out.println("Height= "+ht);
System.out.println("Name= "+name);
}
void bark()
{
System.out.println("Dog barks.Don't tease it");
}
void bite()
{
System.out.println("it may bite");
}
public static void main(String[] args)
{
//create object
Animal dog = new Animal();
//Invoke methods
dog.display();
dog.bark();
dog.bite();
}
}