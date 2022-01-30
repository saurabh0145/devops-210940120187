import java.util.*;
class menu_Card {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int teaQty=0,coffeeQty=0,sandwitchQty=0,samosaQty=0,pannertikkaQty=0,
		rotiQty=0,butternaanQty=0,coldcoffeeQty=0,icecreameQty=0;
		boolean check = true;
		do {
			System.out.println("****Welcome to Snack Center ****");
			System.out.println("1. Tea : Rs.10");
			System.out.println("2. Coffee : Rs.15");
			System.out.println("3. Samosa : Rs.20");
			System.out.println("4. Sandwitch : Rs.50");
			System.out.println("5. Panner Tikka : Rs.200");
			System.out.println("6. Roti : Rs.20");
			System.out.println("7. Butter Naan : Rs.35");
			System.out.println("8. Cold Coffee : Rs.30");
			System.out.println("9. Ice Creame : Rs.20");
			System.out.println("10. Generate Bill & Exit");
			System.out.println("Enter your choice");
			
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Enter quatity of tea : ");
					teaQty += sc.nextInt();
					break;
				case 2:
					System.out.println("Enter quatity of coffee : ");
					coffeeQty += sc.nextInt();
					break;
				case 3:
					System.out.println("Enter quatity of samosa : ");
					samosaQty += sc.nextInt();
					break;
				case 4:
					System.out.println("Enter quatity of sandwitch : ");
					sandwitchQty += sc.nextInt();
					break;
				case 5:
					System.out.println("Enter quatity of paneer tikka : ");
					pannertikkaQty += sc.nextInt();
					break;
				case 6:
					System.out.println("Enter quatity of roti : ");
					rotiQty += sc.nextInt();
					break;
				case 7:
					System.out.println("Enter quatity of butter naan : ");
					butternaanQty += sc.nextInt();
					break;
				case 8:
					System.out.println("Enter quatity of cold coffee : ");
					coffeeQty += sc.nextInt();
					break;
				case 9:
					System.out.println("Enter quatity of ice-creame : ");
					icecreameQty += sc.nextInt();
					break;
				case 10:
					double bill = teaQty * 10 + coffeeQty * 15 + samosaQty*20 + sandwitchQty* 50
								+pannertikkaQty*200+rotiQty*20+butternaanQty*35+coldcoffeeQty*30+icecreameQty*20;
						if(teaQty > 0) System.out.println("Tea Qty = " + teaQty);
						if(coffeeQty > 0) System.out.println("Coffee Qty = " + coffeeQty);
						if(samosaQty > 0) System.out.println("Samosa Qty = " + samosaQty);
						if(sandwitchQty > 0) System.out.println("Sandwitch Qty = " + sandwitchQty);
						if(pannertikkaQty > 0) System.out.println("Panner tikka Qty = " + pannertikkaQty);
						if(rotiQty > 0) System.out.println("Roti Qty = " + rotiQty);
						if(butternaanQty > 0) System.out.println("Butter naan Qty = " + butternaanQty);
						if(coldcoffeeQty > 0) System.out.println("Cold coffee Qty = " + coldcoffeeQty);
						if(icecreameQty > 0) System.out.println("Ice-creame Qty = " + icecreameQty);
						System.out.println("-------------------------------------------");
						System.out.println("Your total bill is : Rs."+ bill);
						check=false;
						break;
				default : 
					System.out.println("Invalid choice. Try again");
				}
				
			} while(check);
			
			sc.close();
		}
	}
		
	
	

