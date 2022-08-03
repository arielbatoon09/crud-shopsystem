import java.util.Scanner;

 class ShopMain{
    public static void main(String[] args){

        ShopMenu menuObj = new ShopMenu();

        Scanner sc = new Scanner(System.in);
        char op;
        do{
            System.out.println("ITEM SHOP MENU:");
            System.out.println("[1] Add New Item");
            System.out.println("[2] Display Item");
            System.out.println("[3] Search Item");
            System.out.println("[4] Delete Item");
            System.out.println("[5] Update Item");
            System.out.println("[0] Press to Exit");
            System.out.print("Enter your choice: ");
            op = sc.next().charAt(0);

            switch(op){
                case '0':
                    System.out.println("\nExit: Thank you for using the program...\n");
                break;
                case '1':
                    menuObj.AddItem();
                break;
                case '2': 
                    menuObj.DisplayItem();
                break;
                case '3': 
                    menuObj.SearchItem();
                break; 
                case '4': 
                    menuObj.DeleteItem();
                break;
                case '5': 
                    menuObj.UpdateItem();
                break; 
                    default: System.out.println("\nError Input: Please try again...\n");
                    break;             
        }            
        }while(op != '0');
    }

}