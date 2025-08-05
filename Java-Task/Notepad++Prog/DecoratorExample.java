// Compenent Interface.
interface Coffe{
    double getCost();
    String getDescription();

}
// Concrete Interface
class simpleCofee implements Coffe{
    public double getCost(){
    return 1.0;
    }
    public String getDescription(){
        return"SimpleCoffe";
    }
}
// Decorator Abstract..
 abstract class CoffeeDecorator implements Coffe{
    protected final Coffe decoratedCofee;

    public CoffeeDecorator(Coffe coffe){
        this.decoratedCofee=coffe;
    }

public double getCost(){
    return decoratedCofee.getCost();

}
public String getDescription(){
   return decoratedCofee.getDescription();
}

}  

//concrete decorator 
class withMilk extends CoffeeDecorator{
    public withMilk(Coffe coffe){
        super(coffe);
    }
    public double getCost(){
        return super.getCost()+10.0;
    }
    public String getDescription(){
        return super.getDescription()+"A Cofee with the Milk";
    }
}


// concrete decorator.
class withSugar extends CoffeeDecorator{
    public withSugar(Coffe coffe){
        super(coffe);
    }
    public double getCost(){
        return super.getCost()+15.0;
    }
    public String getDescription(){
        return super.getDescription()+",With Sugar";
    }
}

public class DecoratorExample {
    public static void main(String[] args) {
       
        Coffe cofee=new simpleCofee();
        System.out.println(cofee.getCost()+" "+cofee.getDescription());
        

         cofee=new withMilk(cofee);
         System.out.println("Details with the Milk.."+cofee.getCost()+" "+cofee.getDescription());

         
         cofee=new withSugar(cofee);
          System.out.println("Details with the Sugar"+cofee.getCost()+" "+cofee.getDescription());
        
    }
    
}
