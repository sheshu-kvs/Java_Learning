interface Cofee1{
    double getCost();
    String getDescription();
}

class SimpleCofee implements Cofee1{
    public double getCost(){
        return 1.0;

    }
    public String getDescription(){
        return "A Simple Coffe";
    }
}

abstract class Decorated implements Cofee1{
    protected  Cofee1 decoratedCofee;

     public Decorated(Cofee1 cf){
        this.decoratedCofee=cf;
     }

     public double getCost(){
        return decoratedCofee.getCost();
     }
     
     public String getDescription(){
        return decoratedCofee.getDescription();
     }

}

class withSugar extends Decorated{
    public withSugar(Cofee1 cf){
        super(cf);
    }

    public double getCost(){
        return super.getCost()+10.5;
    }
    public String getDescription(){
        return super.getDescription()+", With the Sugar";
    } 


}

class withMilk extends  Decorated {
    public withMilk(Cofee1 cf){
        super(cf);
    }

    public double getCost(){
        return super.getCost()+20.5;
    }
    public String getDescription(){
        return super.getDescription()+"With the Milk..";
    }

}


public class DecoratorExamples {
    public static void main(String[] args){
        Cofee1 cofeeInterface=new SimpleCofee();
        System.out.println(cofeeInterface.getCost()+" "+cofeeInterface.getDescription());
        
        cofeeInterface=new withMilk(cofeeInterface);
        System.out.println(cofeeInterface.getCost()+" "+cofeeInterface.getDescription());
                                                                            
       cofeeInterface=new withSugar(cofeeInterface);
        System.out.println(cofeeInterface.getCost()+" "+cofeeInterface.getDescription());
    }
    
}
