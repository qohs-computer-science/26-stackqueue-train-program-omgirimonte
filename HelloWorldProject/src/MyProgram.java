/*
 * TODO: Owen Girimonte
 * TODO: Date
 * TODO: 7
 * TODO: Program Description
 */
import java.util.Scanner;
import java.io.File;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class MyProgram {
	public static int val = 0;
	public static void main(String[] args) {

		int limitTrackA = 100000, limitTrackB = 100000, limitTrackC = 100000;
	
		Scanner x = new Scanner(System.in);
		try{
			File f = new File("HelloWorldProject/src/data.txt");
			x = new Scanner (f);

			Queue <Train> carList = new LinkedList<Train>();
			String spot = x.nextLine();
			while(!spot.equals("END")){
				if (spot.substring(0,3).equals("CAR")){
					String two = x.nextLine();
					String three = x.nextLine();
					String four = x.nextLine();
					int five = x.nextInt();
					int six = x.nextInt();
					x.nextLine();
					carList.add(new Train(spot,two,three,four,five,six));
				}
				else{
					carList.add(new Train(spot, x.nextLine()) );
		
				}
				spot = x.nextLine();
			}

			Stack <Train> bMore = new Stack<>();
			int bWeight = 0;

			Stack <Train >Charl = new Stack<>(); 
			int cWeight = 0;

			Stack <Train>Tren = new Stack<>();
			int tWeight = 0;

			Stack <Train> other = new Stack<>();

			Queue<Train> reviewList = new LinkedList<Train>();

			while (carList.size()>0){
				Train tempCar = carList.remove();
				if (tempCar.getMiles()<=700){
					if ((tempCar.getDestination().equals("Baltimore"))){
						if ((bWeight+tempCar.getWeight())<limitTrackA){
							bMore.push(tempCar);
							bWeight+=tempCar.getWeight();
						}
						else{
							bMore.push(new Train("ENG00000", "Baltimore"));
							System.out.println(bMore.peek().getName()+" leaving for "+bMore.peek().getDestination()+" with the following cars:");
							while(bMore.size()>0){
								Train valCar = bMore.pop();
								System.out.println(valCar.getName()+" containing "+valCar.getProduct());
							}
							bWeight = 0;
						}
					}
					else if ((tempCar.getDestination().equals("Charlotte"))){
						if ((cWeight+tempCar.getWeight())<limitTrackB){
							Charl.push(tempCar);
							cWeight+=tempCar.getWeight();
						}
						else{
							Charl.push(new Train("ENG00000", "Charlotte"));
							System.out.println(Charl.peek().getName()+" leaving for "+Charl.peek().getDestination()+" with the following cars:");
							while(Charl.size()>0){
								Train valCar = Charl.pop();
								System.out.println(valCar.getName()+" containing "+valCar.getProduct());
							}
							cWeight = 0;
						}
						
					}
					else if ((tempCar.getDestination().equals("Trenton"))){
						if((tWeight+tempCar.getWeight())<limitTrackC){
							Tren.push(tempCar);
							tWeight+=tempCar.getWeight();
						}
						else{
							Tren.push(new Train("ENG00000", "Trenton"));
							System.out.println(Tren.peek().getName()+" leaving for "+Tren.peek().getDestination()+" with the following cars:");
							while(Tren.size()>0){
								Train valCar = Tren.pop();
								System.out.println(valCar.getName()+" containing "+valCar.getProduct());
							}
							tWeight = 0;
							System.out.println("No remaining cars in the other track");
							System.out.println(other);
						}
					}
					else {
						
						while(other.size()>0){
							Train valCar = other.pop();
							System.out.println(valCar.getName()+" containing "+valCar.getProduct());
						}
						
						
					}
				}
				else{
					reviewList.add(tempCar);
				}
			}
			System.out.println("Processing cars in review...");
			while (reviewList.size()>0){
				Train tempCar = reviewList.remove();
					if ((tempCar.getDestination().equals("Baltimore"))){
						if ((bWeight+tempCar.getWeight())<limitTrackA){
							bMore.push(tempCar);
							bWeight+=tempCar.getWeight();
						}
						else{
							System.out.println(bMore.peek().getName()+" leaving for "+bMore.peek().getDestination()+" with the following cars:");
							while(bMore.size()>0){
								Train valCar = bMore.pop();
								System.out.println(valCar.getName()+" containing "+valCar.getProduct());
							}
							bWeight = 0;
							System.out.println("\n");
						}
					}
					else if ((tempCar.getDestination().equals("Charlotte"))){
						if ((cWeight+tempCar.getWeight())<limitTrackB){
							Charl.push(tempCar);
							cWeight+=tempCar.getWeight();
						}
						else{
							Charl.push(new Train("ENG00000", "Charlotte"));
							System.out.println(Charl.peek().getName()+" leaving for "+Charl.peek().getDestination()+" with the following cars:");
							while(Charl.size()>0){
								Train valCar = Charl.pop();
								System.out.println(valCar.getName()+" containing "+valCar.getProduct());
							}
							cWeight = 0;
							System.out.println("\n");
						}
						
					}
					else if ((tempCar.getDestination().equals("Trenton"))){
						if((tWeight+tempCar.getWeight())<limitTrackC){
							Tren.push(tempCar);
							tWeight+=tempCar.getWeight();
						}
						else{
							Tren.push(new Train("ENG00000", "Trenton"));
							System.out.println(Tren.peek().getName()+" leaving for "+Tren.peek().getDestination()+" with the following cars:");
							while(Tren.size()>0){
								Train valCar = Tren.pop();
								System.out.println(valCar.getName()+" containing "+valCar.getProduct());
							}
							tWeight = 0;
							System.out.println("\n");
						}
					}
					else {
						
							while(other.size()>0){
								Train valCar = other.pop();
								System.out.println(valCar.getName()+" containing "+valCar.getProduct());
							}
						
						
					}
			}
			System.out.println("Departing all tracks:");
			
			if (!bMore.isEmpty()){
				bMore.push(new Train("ENG00000", "Baltimore"));
				System.out.println(bMore.peek().getName()+" leaving for "+bMore.peek().getDestination()+" with the following cars:");
				while(bMore.size()>0){
					bMore.pop();
					Train valCar = bMore.pop();
					System.out.println(valCar.getName()+" containing "+valCar.getProduct());
					}
				bWeight = 0;
				System.out.println("The Baltimore track is empty");
			}
			else{
				System.out.println("The Baltimore track is empty");
			}

			
			if(!Charl.isEmpty()){
				Charl.push(new Train("ENG00000", "Charlotte"));
				System.out.println(Charl.peek().getName()+" leaving for "+Charl.peek().getDestination()+" with the following cars:");
				while(Charl.size()>0){
					Charl.pop();
					Train valCar = Charl.pop();
					System.out.println(valCar.getName()+" containing "+valCar.getProduct());
				}
				cWeight = 0;
				System.out.println("The Charlotte track is empty");
			}
			else{
				System.out.println("The Charlotte track is empty");
			}
 

			if (!Tren.isEmpty()){
				Tren.push(new Train("ENG00000", "Trenton"));
				System.out.println(Tren.peek().getName()+" leaving for "+Tren.peek().getDestination()+" with the following cars:");
				while(Tren.size()>0){
					Tren.pop();
					Train valCar = Tren.pop();
					System.out.println(valCar.getName()+" containing "+valCar.getProduct());
				}
				tWeight = 0;
				System.out.println("The Trenton track is empty");
			}
			else{
				System.out.println("The Trenton track is empty");

			}

			while(other.size()>0){
				Train valCar = other.pop();
				System.out.println(valCar.getName()+" containing "+valCar.getProduct());
			}

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}