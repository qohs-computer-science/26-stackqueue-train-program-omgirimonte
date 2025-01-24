public class Train {
    private String name, product, origin, destination;
    private int weight, miles;
    boolean isEng;

    public Train (String Name, String Product, String Origin, String Destination, int Weight, int Miles){
        name = Name;
        product = Product;
        origin = Origin;
        destination = Destination;
        weight = Weight;
        miles = Miles;
    }

    public Train (String engineName, String place){
        name = engineName;
        destination = place;
        product = "";
        origin = "";
        weight = 0;
        miles = 0;
        isEng = true;
        
    }


    public String getName(){
        return name;
    }

    public String getProduct(){
        return product;
    }

    public String getOrigin(){
        return origin;
    }

    public String getDestination(){
        return destination;
    }

    public int getWeight(){
        return weight;
    }

    public int getMiles(){
        return miles;
    }



    public void setName(String val){
        name = val;
    }

    public void setProduct(String val){
        product = val;
    }

    public void setOrigin(String val){
        origin = val;
    }

    public void setDestination(String val){
        destination = val;
    }

    public void setWeight(int val){
        weight = val;
    }

    public void setMiles(int val){
        miles = val;
    }
}
