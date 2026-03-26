abstract class A
{
abstract void run();
}
class B extends A
{
viod run()
{
system.out.print\n("running safel");
}
public static viod main(string arg[])
{
B obj=new B();
obj.run();
}
}