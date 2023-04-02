import java.util.Scanner;
public class TindahanNiAteKyline {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price [] = {1.5,25.0,20.0};
        boolean sell = true;
        int total = 0;
        System.out.print("Welcome sa aming tindahan!\n");
        
        while(sell){
            
        System.out.print("Available Foods!\n");
        System.out.print("1.) Fishball\n2.) Burger\n3.) French Fries\n4.) Exit\n");
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        switch(choice){
            case 4:
              System.out.print("\nEXITING---");
              break;
        }
        
        if(choice >= 1 && choice <= 4){
            System.out.print("Enter quantity : ");
            int quantity = input.nextInt();
            
            total += price[choice - 1] * quantity;
            
            System.out.print("Do you want to buy more ? (y/n) : ");
            input.nextLine();
            String buyMore = input.nextLine();
            
            if(buyMore.equalsIgnoreCase("n")){
                sell = false;
                
                System.out.print("The total price is : P " + total + "\n");
                
                System.out.print("Enter your payment here : P ");
                int payment = input.nextInt();
                
                int change = payment - total;
                
                System.out.print("Chage : P " + change + "\n");
                
                System.out.print("\nTHANK YOU, PLESE COME AGAIN!");
            }
            
        }
        else{
            System.out.print("\n\nINVALID CHOICE!");
        }
        
        }
        
    }
}
