class Animal
{
//variable
static int age = 5;
static float ht = 2.79f;
static String name = "Snoopy";
//methods
static void display()
{
System.out.println("Age= "+age);
System.out.println("Height= "+ht);
System.out.println("Name= "+name);
}
static void bark()
{
System.out.println("Dog barks.Don't tease it");
}
static void bite()
{
System.out.println("it may bite");
}
public static void main(String[] args)
{
//create object
//Invoke methods
Animal.display();
Animal.bark();
Animal.bite();
}
}