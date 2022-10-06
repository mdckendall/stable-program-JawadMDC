//Create the Horse class here.

public class Horse {
    public String name_horse;
    public double weight_horse;
    public boolean tame_horse;

public Horse(String name_horse, double weight_horse, boolean tame_horse)
  {
    this.name_horse = name_horse;
    this.weight_horse = weight_horse;
    this.tame_horse = tame_horse;
    
  }
  
   public String getName(){
        return this.name_horse;
    }
    public double getWeight(){
        return this.weight_horse;
    }
    public boolean getTame(){
        return this.tame_horse;
    }
}
