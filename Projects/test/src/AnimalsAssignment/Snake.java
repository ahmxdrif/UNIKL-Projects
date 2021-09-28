package AnimalsAssignment;

public class Snake extends Animals
{
    private String species;

    public Snake() //default constructor
    {  super ("Jake" , 4 , "Black scales");
        setSpecies("Cobra");
    }

    public Snake(String species) //overload constructor of default constructor
    { super("Rocky", 5, "Yellow scales");
        this.species = species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void ShedSkin()
    {
        System.out.println("The scales of the snake have shed.");
    }

    public void LayEggs()
    {
        System.out.println("The snake laid some eggs.");
    }

    public void displaySnakeDetails()
    {
        System.out.println("The snake name is: "+Name);
        System.out.println(Name+" "+"age is: "+Age);
        System.out.println(Name+" "+"appearance is: "+Appearance);
        System.out.println(Name+" "+"species is: "+getSpecies());
    }
}
