package OOPExercise;
public class Sales 
{
    private String salesId; //id of the sales
    private double amount; //amount of sales
    private double discount;
    private double priceAfterDiscount;

    public Sales() //no argument constructor
    {
        
    }

    public Sales(String salesId, double amount) //overload constructor
    {
        this.amount = amount;
        this.salesId = salesId;
    }

    public void setSalesId(String salesId) 
    {
        this.salesId = salesId;
    }

    public String getSalesId() 
    {
        return salesId;
    }

    public double getAmount() 
    {
        return amount;
    }

    public void setAmount(double amount) 
    {
        this.amount = amount;
    }

    public double determineDiscount(double amount)
    {
        this.amount = amount;

        if(amount>=900.00)
        {
             discount = 0.10;
             priceAfterDiscount = amount - (amount*discount);
        }
        else if((amount<900)&&(amount>=500))
        {
            discount = 0.08;
            priceAfterDiscount = amount - (amount*discount);
        }
        else
        {
            discount = 0.04;
            priceAfterDiscount = amount - (amount*discount);
        }
        return discount;
    }

    public void displaySalesObject(String salesId, double amount)
    {
        System.out.println("Sales ID: " + salesId);
        System.out.println("Amount: " + amount);
        System.out.println("Discount: " + discount*100);
        System.out.println("Price after discount: " + priceAfterDiscount);
    }

    public void displaySalesArray(String salesId, double amount)
    {
        System.out.println(salesId + " " + amount);
    } 
}
