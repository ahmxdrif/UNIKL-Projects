package OOPExercise;
import java.util.Scanner;
public class Test 
{
    public static void main(String[]args)
    {
        Scanner inputAmount = new Scanner(System.in);
        Scanner inputID = new Scanner(System.in);
        String tempID;
        double tempAmount;

        //Question a
        Sales s1 = new Sales("SALE6003" , 800);
        Sales s2 = new Sales("SALE7003" , 400);

        //Question a(1)
        s2.setAmount(500);
        s2.setSalesId("SALE5003");

        //Question a(2) and (3) 
        s1.determineDiscount(s1.getAmount());
        s2.determineDiscount(s2.getAmount());
        s1.displaySalesObject(s1.getSalesId(),s1.getAmount());
        s2.displaySalesObject(s2.getSalesId(),s2.getAmount());

        //Question b
         Sales [] salesArrays;
         salesArrays = new Sales[4];

        for(int counter=0;counter<salesArrays.length;counter++) 
        {
                System.out.println("Please enter a sales ID:");
                tempID = inputID.nextLine();
                // inputID.close();
                System.out.println("Please enter an amount:");
                tempAmount = inputAmount.nextDouble();
                // inputAmount.close();
                salesArrays[counter] = new Sales(tempID,tempAmount);
        }
        System.out.println("salesID: " + " " + "Amount");
        for(int counter=0;counter<salesArrays.length;counter++)
        {
            salesArrays[counter].displaySalesArray(salesArrays[counter].getSalesId(),salesArrays[counter].getAmount());
        }
    }
}
