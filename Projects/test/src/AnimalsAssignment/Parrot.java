package AnimalsAssignment;

public class Parrot extends Animals
{
    private String ability;

    public Parrot() //default constructor
    { super ("Steven", 3 , "Blue and white feathers");
        setAbility("Can speak");
    }

    public void setAbility(String ability) 
    {
        this.ability = ability;
    }

    public String getAbility() 
    {
        return ability;
    }

    public Parrot(String ability) // overload constructor of default constructor
    { super ("Deangelo" , 6 , "Rainbow Feathers");
        this.ability = ability;
    }

    public void ImitateSounds()
    {
        System.out.println("The parrot is copying the sounds of its surroundings.");
    }

    public void Fly()
    {
        System.out.println("The parrot can fly high.");
    }

    public void displayParrotDetails()
    {
        System.out.println("The parrot name is: "+Name);
        System.out.println(Name+" "+"age is: "+Age);
        System.out.println(Name+" "+"appearance is: "+Appearance);
        System.out.println(Name+" "+getAbility());
    }
}
