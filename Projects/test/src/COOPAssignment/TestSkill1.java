package COOPAssignment;
public class TestSkill1
{
    public static void main(String[]args)
    {
        int Data[] = {24,6,26,80,30};
        int totalData = 0;
        int Average;

        System.out.println("Data :");
        for(int counter=0;counter<Data.length-1;counter++)
        {
            System.out.println(Data[counter]);
        }
        for(int counter=0;counter<=Data.length - 1;counter++)
        {
            totalData += Data[counter];
        }

        Average = totalData/Data.length;
        System.out.println("Total data : "+totalData);
        System.out.println("Average :" + Average);
    }
}