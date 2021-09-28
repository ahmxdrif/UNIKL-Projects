package AnimalsAssignment;

public class AnimalTest 
{
    public static void main(String[]args)
    {
        //tiger 1
        System.out.println("Tiger examples: ");
        System.out.println("___________________________________");
        Tiger Tiger1 = new Tiger("Himalayan"); //overload constructor
        Tiger1.displayTigerDetails(); //displays information about Tiger1
        Tiger1.Hunting();
        Tiger1.OccupySpace();
        System.out.println(Tiger1);

        //tiger 2
        Tiger Tiger2 = new Tiger(); //default constructor
        Tiger2.displayTigerDetails(); //displays information about Tiger2
        Tiger2.Hunting();
        Tiger2.OccupySpace();
        System.out.println("___________________________________");

        //parrot 1
        System.out.println("Parrot examples: ");
        System.out.println("___________________________________");
        Parrot Parrot1 = new Parrot("Can ride tricycle."); //overload constructor
        Parrot1.displayParrotDetails(); //displays information about Parrot1
        Parrot1.ImitateSounds();
        Parrot1.Fly();

        //parrot 2
        Parrot Parrot2 = new Parrot(); //default constructor
        Parrot2.ImitateSounds();
        Parrot2.Fly();
        Parrot2.displayParrotDetails(); //displays information about Parrot2
        System.out.println("___________________________________");

        //snake 1
        System.out.println("Snake examples: ");
        System.out.println("___________________________________");
        Snake Snake1 = new Snake("Rattle Snake"); //overload constructor
        Snake1.displaySnakeDetails(); //displays information about Snake1
        Snake1.LayEggs();

        //snake 2
        Snake Snake2 = new Snake("Viper Snake"); //overload constructor
        Snake2.displaySnakeDetails(); //displays information about Snake2
        Snake2.ShedSkin();
        System.out.println("___________________________________");
        
    }    
}
