import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Tax Calculator App");
        System.out.println("-------WELCOME----------");
        System.out.println("Enter total person count");
        int person;
        Scanner scanner = new Scanner(System.in);
        person = scanner.nextInt();
        String[] name=new String[10];
        long[] income=new long[10];
        for (int i = 1; i < person; i++) {
            System.out.println("enter name" + i);

            name[i] = scanner.next();
            System.out.println("enter" + name[i] +"'s Annual income");
            income[i]=scanner.nextLong();
            calculateTax(name[i],income[i]);

        }
        System.out.println("Names with liable taxes");
        System.out.println("---------------------------------------");
        for(int i=1;i<person;i++)
        {

            calculateTax(name[i],income[i]);
        }

    }
    private static void  calculateTax(String name ,long income )

    {


        long tax ;
        if(income>=300000)
        {
            tax=(income*20)/100;

        }
        else if(income>=100000 )
        {
            tax=(income*10)/100;

        }
        else
        {
            tax=0;

        }
        System.out.println(name + ":  \u20B9" + tax);
    }
}