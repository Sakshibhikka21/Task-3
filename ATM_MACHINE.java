//program for ATM_Machine
import java.util.Scanner;
public class ATM_MACHINE
{
public static void main(String arg[])
{
	try
	{
	int blance=0,withdraw,deposit;
	Scanner s=new Scanner(System.in);
	while(true)
	{
	System.out.println("ATM Machine \n");
	System.out.println("choose 1 for deposit");
	System.out.println("choose 2 for withdraw");
	System.out.println("choose 3 for check blance");
	System.out.println("choose 4 for EXIT\n");
	System.out.println("choose the operation");

	int choice=s.nextInt();
	switch(choice)
	{
        case 1:
	System.out.println("Enter money to be deposit");
	deposit=s.nextInt();
	blance=blance+deposit;
	System.out.println("Your money has been successfully deposited");
	System.out.println("");
	break;

	case 2:
	System.out.println("Enter money to be withdraw");
	withdraw=s.nextInt();
	
	if(blance>=withdraw)
	{
	blance=(blance-withdraw);
	System.out.println("Please collect your money...");
	}
	else
	{
	System.out.println("Infficent blance");
	}
	System.out.println("");
	break;
 
	
 
	case 3:
	System.out.println("Blance:"+blance);
	System.out.println("");
	break;
	
	case 4:
	System.exit(0);
	}
    }
}
	catch(Exception e)
	{
	System.out.println("Enter the amount only");
	}
	finally
	{
	System.out.println("THANK YOU....");
	}
}
}
