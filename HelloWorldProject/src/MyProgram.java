/*
 * TODO: Name
 * TODO: Date
 * TODO: Class Period
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
			String name = x.nextLine();
			System.out.println(name);
			Queue carList = new LinkedList();
			String spot = x.nextLine();
			while(!spot.equals("END")){
				if (spot.substring(0,3).equals("CAR"))
					String one = x.nextLine();
					String two = x.nextLine();
					String three = x.nextLine();
					String four = x.nextLine();
					int five = x.nextLine();
					int six = x.nextLine();
					boolean isEngine = false;
					carList.add(new Train(one,two,three,four,five,six));
			}

			Stack bMore = new stack();
			int bWeight = 0;

			Stack Charl = new stack(); 
			int cWeight = 0;

			Stack Tren = new stack();
			int tWeight = 0;

			Stack other = new stack();
			int oWeight = 0;


			Queue reviewList = new LinkedList();

			while (carList.size()>0){
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}
