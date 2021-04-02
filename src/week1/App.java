package week1;

public class App {

	public static void main(String[] args) {
		// Price of Item One
		double itemOnePrice = 3.75;
		//Initial amount of money in Wallet One
		double moneyInWalletOne = 10.50;
						
		// Price of Item Two
		double itemTwoPrice = 4.5;
		//Initial amount of money in Wallet Two
		double moneyInWalletTwo = 5.50;
						
		//Total number of friends of person1
		int numberOfFriends1 = 15;
		//Age in years (as a whole number) of person1
		int age1 = 10;
		
		//Total number of friends of person2
		int numberOfFriends2 = 25;
		//Age in years of person2
		int age2 = 5;
		
		//Number of friends made each year by person1
		double numberOfFriendsPerYear1 = numberOfFriends1/(double)age1;
		
		//Number of friends made each year by person2
		double numberOfFriendsPerYear2 = numberOfFriends2/(double)age2;
		
		//My First name
		String myFirstName = "Mamta";		
		//My Last name
		String myLastName = "Nath";		
		//My Middle initial
		char myMiddleIntitial = 'S';
		//My full name based on my first name, middle initial, and last name
		String myFullName = myFirstName + " " + myMiddleIntitial + " " + myLastName;
		
		//My Friend's First name
		String myFriendFirstName = "Cathy";		
		//My Friend's Last name
		String myFriendLastName = "Locke";		
		//My Friend's Middle initial
		char myFriendMiddleIntitial = 'B';
		//My friend's full name based on my friend's first name, middle initial, and last name
		String myFriendFullName;
		myFriendFullName = myFriendFirstName + " " + myFriendMiddleIntitial + " " + myFriendLastName;
		
		System.out.println("The price of Item One is: $" + itemOnePrice);
		System.out.println("Initial money in Wallet One is: $" + moneyInWalletOne);
		
		//Amount of money left in Wallet One after buying Item One is:
		moneyInWalletOne = moneyInWalletOne - itemOnePrice;
		System.out.println("Amount of money left in Wallet One after buying Item One is: $" + moneyInWalletOne + "\n");
						
		System.out.println("The price of Item Two is: $" + itemTwoPrice);
		System.out.println("Initial money in Wallet Two is: $" + moneyInWalletTwo);
		
		//Amount of money left in Wallet Two after buying Item Two is:
		moneyInWalletTwo = moneyInWalletTwo - itemTwoPrice;
		System.out.println("Amount of money left in Wallet Two after buying Item Two is: $" + moneyInWalletTwo + "\n");
				
		System.out.println("Total number of friends Person 1 has: " + numberOfFriends1);
		System.out.println("Age of Person 1 is: " + age1);
		System.out.println("Number of friends made each year by person 1 is: " + numberOfFriendsPerYear1 + "\n");
		
		System.out.println("Total number of friends Person 2 has: " + numberOfFriends2);
		System.out.println("Age of Person 2 is: " + age2);
		System.out.println("Number of friends made each year by person 2 is: " + numberOfFriendsPerYear2 + "\n");
						
		System.out.println("My full name is: " + myFullName);
		System.out.println("My friend's full name is: " + myFriendFullName);
	}

}
