import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ItemShop{
    private int index;
    private String itemDesc;
    private float itemPrice;
 
    ItemShop(int ind, String desc, float price){
       this.index = ind;
       this.itemDesc = desc;
       this.itemPrice = price;
    }
 
    public int getIndex(){
       return index;
    }
    public float getPrice(){
       return itemPrice;
    }
    public String getName(){
       return itemDesc;
    }

    public String toString(){
        LocalDateTime createdDate = LocalDateTime.now();
        LocalDateTime updatedDate = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-YYYY");

        return getIndex()+"\t\t"+getName()+"\t\t\t"+dtf.format(createdDate)+"\t\t"+dtf.format(updatedDate)+"\t\t"+String.format("P%.2f", getPrice());
    }
 }
