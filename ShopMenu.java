import java.util.*;

public class ShopMenu {

    private List<ItemShop> ItemList = new ArrayList<ItemShop>(); 
    private Scanner sc = new Scanner(System.in); 
    private Scanner sc1 = new Scanner(System.in);
    private int index;
    
    // Adding Item Method
    public void AddItem(){
        String desc;
        float price;
        Random rnd = new Random();
        int itemIndex = rnd.nextInt(999999);
        int indLength = String.valueOf(itemIndex).length();
        
        if(indLength == 6){
            System.out.print("\nEnter Item Description: ");
            desc = sc1.nextLine();
    
            int lengDesc = desc.length();
            if(lengDesc >= 8 && lengDesc <= 10){
                System.out.print("Enter Item Price: ");
                price = sc.nextFloat();
    
                ItemList.add(new ItemShop(itemIndex, desc, price));
                System.out.println("Item Added Successfully...\n");
            }
            else{
                System.out.println("Error: Enter atleast 8-10 letters...\n");
            }
        }
    }

    // Display Item Method
    public void DisplayItem(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("Item Index"+"\t"+"Item Description"+"\t\t"+"Item Created"+"\t\t"+"Item Update"+"\t\t"+"Item Price");

        Iterator<ItemShop>  i = ItemList.iterator(); 

            while(i.hasNext()){
                ItemShop list = i.next(); 
                System.out.println(list);
            }
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

    // Search Item Method
    public void SearchItem(){
        boolean search = false;

        System.out.print("\nEnter Item Index to Search: ");
        index = sc.nextInt();

        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("Item Index"+"\t"+"Item Description"+"\t\t"+"Item Created"+"\t\t"+"Item Update"+"\t\t"+"Item Price");
        Iterator<ItemShop> i = ItemList.iterator();

        while(i.hasNext()){
            ItemShop list = i.next();
            if(list.getIndex() == index)  {
                System.out.println(list);
                search = true;
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        
        if(!search){
        System.out.println("\n>>> Item Not Found <<<\n");
        }
    }

    // Delete Item Method
    public void DeleteItem(){
        char ch;
        boolean search = false;

        do{
            System.out.print("Enter Item Index to Delete: ");
            index = sc.nextInt();
    
            Iterator<ItemShop> i = ItemList.iterator();
            while(i.hasNext()){
                ItemShop list = i.next();
                if(list.getIndex() == index){
                    i.remove();
                    search = true;
                }
            }

            System.out.print("Do you want to delete another item?(Y/N): ");
            ch = sc.next().charAt(0); 

            if(!search){
                System.out.println(">>> Item Not Found <<<\n");
            }else{
                System.out.println(">>> Item is Deleted Successfully... <<<\n");
            }

        } while(ch == 'Y' || ch == 'y');
    }

    // Update Item Method
    public void UpdateItem(){
        boolean search = false;
        
        System.out.print("\nEnter Item Index to Update: ");
        index = sc.nextInt();
        
        ListIterator<ItemShop>li = ItemList.listIterator();
        while(li.hasNext()){ 
        ItemShop list = li.next();
            if(list.getIndex() == index){
                
                System.out.print("Enter new Item Description: ");
                String desc = sc1.nextLine();

                int lengDesc = desc.length();
                if(lengDesc >= 8 && lengDesc <= 10){
                    System.out.print("Enter new Item Price: ");
                    int price = sc.nextInt();
                    search = true;

                    li.set(new ItemShop(index,desc,price));
                }
                else{
                    System.out.println("Error: Enter atleast 8-10 letters...\n");
                }
                
            }
        }
        if(!search){
            System.out.println(">>> Item Not Found <<< \n");
        }else{
            System.out.println(">>> Item is Updated Successfully... <<<\n");
        }
    }
}
