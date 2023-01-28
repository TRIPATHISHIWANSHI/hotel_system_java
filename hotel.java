import java.util.*;
//Hotel Menu System Design, We can order the Items and we get a Bill
public class hotel 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int price=0;
		System.out.println("                             Good food makes you happy!                                            ");
		System.out.println("\t\t\tArrive as guests, leave as friends\n\t\t\t\t HEARTIEST WELCOME");
		while(true) {
		System.out.println("\tMENU\nWhat would you like to order\n1.BEVERAGES\n2.BREAKFASTS\n3.LUNCH\n4.DINNER\n5.THAT'S ALL");
	
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("1.HOT BEVERAGE\n2.COLD BEVERAGE");
			int select=sc.nextInt();
			if(select==1)
			{
				System.out.println("1.TEA\t\t\tRs 30\n2.COFFEE\t\tRs 40\n3.CAPPUCCINO\t\tRs 50\n4.HOT CHOCOLATE\t\tRs 45\n5.GREEN TEA\t\tRs 120\n6.EXPRESSO\t\tRs 80");
				int order=sc.nextInt();
				if(order==1)
				{
					price+=30;
				}
				else if(order==2)
				{
					price+=40;
				}
				else if(order==3)
				{
					price+=50;
				}
				else if(order==4)
				{
					price+=45;
				}
				else if(order==5)
				{
					price+=120;
				}
				else if(order==6)
				{
					price+=80;
				}
			}
			else if(select==2)
			{
				System.out.println("1.Iced Latte\t\t\tRs 130\n2.COLD COFFEE\t\t\tRs 40\n3.BLUE LAGOON\t\t\tRs 80\n4.CHOCOLATE SHAKE\t\tRs 65\n5.ICED GREEN TEA\t\tRs 120\n6.VANILLA SHAKE\t\t\tRs 80");
				int order=sc.nextInt();
				if(order==1)
				{
					price+=130;
				}
				else if(order==2)
				{
					price+=40;
				}
				else if(order==3)
				{
					price+=80;
				}
				else if(order==4)
				{
					price+=65;
				}
				else if(order==5)
				{
					price+=120;
				}
				else if(order==6)
				{
					price+=80;
				}
			}
		}
		if(choice==2)
		{
			System.out.println("1. Rava Dosa\t\tRs 60\n2.Aloo Paratha\t\tRs 55\n3.Sandwich\t\tRs 60\n4.MAGGIE\t\tRs 60\n5.BURGER\t\tRs80");
			int order=sc.nextInt();
			if(order==1)
			{
				price+=60;
			}
			else if(order==2)
			{
				price+=55;
			}
			else if(order==3)
			{
				price+=60;
			}
			else if(order==4)
			{
				price+=60;
			}
			else if(order==5)
			{
				price+=80;
			}
				
		}
		if(choice==3)
		{
			System.out.println("1. CHOLE BHATURA\t\tRs 60\n2.MASALA DOSA\t\tRs 55\n3.RAJMA RICE\t\tRs 60\n4.BIRYANI\t\tRs 60\n5.IDLI SAMBHAR\t\tRs80");
			int order=sc.nextInt();
			if(order==1)
			{
				price+=60;
			}
			else if(order==2)
			{
				price+=55;
			}
			else if(order==3)
			{
				price+=60;
			}
			else if(order==4)
			{
				price+=60;
			}
			else if(order==5)
			{
				price+=80;
			}
				
		}
		if(choice==4)
		{
			System.out.println("1.CHAPATI\n2.CURRY");
			int select=sc.nextInt();
			if(select==1)
			{
				System.out.println("1.TANDOORI ROTI\t\tRs 15\n2.GARLIC NAAN\t\tRs 40\n3.BUTTER NAAN\t\tRs 50\n4.MISSI ROTI\t\tRs 45");
				int order=sc.nextInt();
				if(order==1)
				{
					price+=15;
				}
				else if(order==2)
				{
					price+=40;
				}
				else if(order==3)
				{
					price+=50;
				}
				else if(order==4)
				{
					price+=45;
				}
				
			}
			else if(select==2)
			{
				System.out.println("1.KADHAEE PANEER\t\tRs 130\n2.PALAK PANEER\t\tRs 140\n3.SHAHI PANEER\t\tRs 100\n4.MIX VEG\t\tRs 85\n5.AMRITSARI PANEER\t\tRs 120\n6.MANCHURIAN\t\tRs 180");
				int order=sc.nextInt();
				if(order==1)
				{
					price+=130;
				}
				else if(order==2)
				{
					price+=140;
				}
				else if(order==3)
				{
					price+=100;
				}
				else if(order==4)
				{
					price+=85;
				}
				else if(order==5)
				{
					price+=120;
				}
				else if(order==6)
				{
					price+=180;
				}
			}
		}
		if(choice==5)
			
			{
				System.out.println("------------------------------------------------------------------------------------------------------------------------");
				System.out.println("BILL");
				System.out.println("---------------------------------------------------------------------------------------------------------------");
				System.out.println("TOTAL\t\t\t\t\t\tRs."+price);
				System.exit(0);
			}
		}
		
	}
}
