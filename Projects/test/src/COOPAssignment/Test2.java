package COOPAssignment;
public class Test2 
{
    public static void main(String[]args)
    {
        String [] p = {"Process1" , "Process2" , "Process3" , "Process4"};
        int [] a = {48 , 45, 35, 22};
        int numData = 4;
        int numCycle = numData - 1;
        int tempNum;
        String tempPros;
        
        for(int counter=1;counter<=numCycle;counter++)
        {
            if(a[counter] > a[counter + 1])
            {
                tempNum = a[counter+1];
                a[counter+1] = a[counter];
                a[counter] = tempNum;

                tempPros = p[counter+1];
                p[counter+1] = p[counter];
                p[counter] = tempPros;
            }
            
        }
        
        for(int counter2=1;counter2<=numData;counter2++)
        {
            System.out.println(p[counter2] + a[counter2]);
        }
    }
}
