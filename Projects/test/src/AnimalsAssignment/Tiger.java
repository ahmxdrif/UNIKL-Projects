package AnimalsAssignment;

public class Tiger extends Animals
{
    private String breed;

    public Tiger() //default constructor
    { super("Tai Lung", 13 , "Orange fur and white strips");
        setBreed("Chinese");
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    
    public Tiger(String breed) // overload constructor of default constructor
    { super ("Tigress" , 10 , "Orange fur with black strips");
        this.breed = breed;
    }


    public void Hunting()
    {
        System.out.println("The tiger hunts the prey.");
    }

    public void OccupySpace()
    {
        System.out.println("The tiger occupies space.");
    }

    public void displayTigerDetails()
    {
        System.out.println("The tiger name is: "+Name);
        System.out.println(Name+" "+"age is: "+Age);
        System.out.println(Name+" "+ "appearance is: "+Appearance);
        System.out.println(Name+" "+ "breed is: "+getBreed());
        System.out.println(super.toString());
    }

    public String toString()
    {
        return("The breed of this tiger is: " +breed);
    }

}

