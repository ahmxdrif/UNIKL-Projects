package AnimalsAssignment;

public class Animals 
{
    public String Name;
    public int Age;
    public String Appearance;

    Animals(String Name, int Age, String Appearance)
    {
        this.Name = Name;
        this.Age = Age;
        this.Appearance = Appearance; 
    }

    public String toString()
    {
        return("Name of animal: " + Name + "\n" + "Age of animal: " + Age + "\n" + "Appearance of animal: " + Appearance);
    }
}
