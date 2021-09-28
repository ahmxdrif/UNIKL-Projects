package COOPAssignment;

public class Task3 {
    
    public static void main(String[]args){
      
      int[] data={24,6,26,80,30};
      
      System.out.println("Before Sorted");
      for(int counter=0;counter<data.length;counter++)
      {
          System.out.print(" "+data[counter]+" ");
      }
      
      System.out.println("\n");
      
      System.out.println("Data change view");
      
      for(int counter=0;counter<data.length;counter++)
      {
          for(int counter2=0;counter2<data.length;counter2++)
          {
              if(data[counter]<data[counter2])
              {    
                  int tempData = data[counter];
                  
                  data[counter] = data[counter2];
                  //24
                  
                  data[counter2]= tempData;
              }
          }
           for(int counter3=0;counter3<data.length;counter3++)
           {
                   System.out.print(" "+data[counter3]+" ");
            }
            System.out.println("");
      }//foreach i 
      
      System.out.println("After Sorted");
      for(int counter3=0;counter3<data.length;counter3++)
        {
                   System.out.print(" "+data[counter3]+" ");
        }//foreach k
      
      
  }
  
}