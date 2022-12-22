import java.io.DataInputStream;
class Bank
{
public static void main(String Args[])
{
int no = 0;
DataInputStream in = new DataInputStream(System.in);
Bank b1 = new Bank();
while(no<5)
{
System.out.println("1.create");
System.out.println("2.deposit");
System.out.println("3.withdraw");
System.out.println("4.display");
System.out.println("please enter valid choise");
try
{
no = Integer.parseInt(in.readLine());
switch(no)
{
case 1:
b1.create();
break;
case 2:
b1.deposit();
break;
case 3:
b1.withdraw();
break;
case 4:
b1.display();
break;
default:
System.out.println("enter no from 1 to 4");
break;
}
}
catch (Exception e)
{
System.out.println("error:");
}
}
}
void create()
{
System.out.println("In create");
}
void deposit()
{
System.out.println("in deposit");
}
void withdraw()
{
System.out.println("In withdraw");
}
void display()
{
System.out.println("in display");
}
}
