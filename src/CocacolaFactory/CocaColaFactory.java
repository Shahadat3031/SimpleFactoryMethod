package CocacolaFactory;

public class CocaColaFactory {

    public CocaCola createFactoryAgent(String type){

        if(type == null){
            return  null;
        }
        if(type.equalsIgnoreCase("250ml")){
            return new CocaCola250ml();
        } else if(type.equalsIgnoreCase("500ml")){
            return new CocaCola500ml();
        }else if(type.equalsIgnoreCase("1000ml")){
            return new CocaCola1000ml();
        }else if(type.equalsIgnoreCase("2000ml")){
            return new CocaCola2000ml();
        } else{
            return null;
        }
    }

}
