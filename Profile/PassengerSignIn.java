import java.util.Scanner;

public class PassengerSignIn {
	//��½
	public static Passenger getPassenger(){
		
        Passenger p = new Passenger();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type in username");
        p.setuName(sc.nextLine());
        System.out.println("Please type in password");
        p.setpassword(sc.nextLine());
        p.status=true;
        return  p;
    }
	//ע��
    public static Passenger registerPassenger(){
    	Passenger p = new Passenger();
    	 Scanner sc = new Scanner(System.in);
         System.out.println("Please type in username");
         p.setuName(sc.nextLine());
         System.out.println("Please type in firstname");
         p.setfName(sc.nextLine());
         System.out.println("Please type in lastname");
         p.setlName(sc.nextLine());
         System.out.println("Are you a smoker? (true/false)");
         p.setsmoker(sc.nextBoolean());
         System.out.println("Please type in your gender");
         p.setgender(sc.nextInt());
         System.out.println("Please type in email");
         p.setemail(sc.nextLine());
         System.out.println("Please type in password");
         p.setpassword(sc.nextLine());
         return  p;
         }
}
