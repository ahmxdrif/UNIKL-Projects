package COOPAssignment;
public class TestSkill2 
{
    public static void main(String [] args)
    {
        int Data[] = {24,6,26,80,30}; // 6,24,26,80,30
        int tempData;
        int round = 0;
        System.out.print("\n");
        System.out.println("Data before sort: ");
        for(int counter=0;counter<Data.length;counter++)
        {
            System.out.print(Data[counter]+" ");
        }
        System.out.print("\n"); 
            for(int c1=0;c1<Data.length-1;c1++)
            {
                if(Data[c1] > Data[c1+1])
                {
                    tempData = Data[c1+1];
                    Data[c1+1] = Data[c1];
                    Data[c1] = tempData;
                    round+=1;

                    System.out.println("Round : " + round);
                    for(int c2=0;c2<Data.length;c2++)
                    {
                        System.out.print(Data[c2] + " ");
                    }
                    System.out.print("\n");
                }
            }
            System.out.println("-------------------------");
            System.out.println("Final Round: ");
            for(int c3=0;c3<Data.length;c3++)
            {
                System.out.print(Data[c3] + " ");
            }
    }    
}
