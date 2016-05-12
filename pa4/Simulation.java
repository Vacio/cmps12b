import java.io.*;
import java.util.Scanner;

public class Simulation {
	public static void main(String[] args) throws IOException {

		/*Variables*/
		Scanner sc = null;
		PrintWriter report = null;
		PrintWriter trace = null;
		String jobs = null; /*Number of jobs, first line of input*/
		Queue StorageC = new Queue(); /*Stores jobs from inFile*/
		Queue Storage = new Queue();
		int m;

		try { /*Check command line arguments*/
			if (args.length != 1) {
				System.out.println("Usage: Simultation infile");
				System.exit(1);
			}

			/*input*/
			sc = new Scanner(new File(args[0]));
			report = new PrintWriter(new FileWriter(args[0] + ".rpt"));
			trace = new PrintWriter(new FileWriter(args[0] + ".trc"));
		} catch(FileNotFoundException e) {
			System.out.println("Caught Exception " + e);
			System.exit(1);
		}

		m = numOfJobs(sc);

		while(sc.hasNextLine()) {
			StorageC.enqueue((Job)getJob(sc));
		}

	}

	/*Returns number of jobs needed to be completed*/
	public static int numOfJobs(Scanner sc) { 
		String s = sc.nextLine();
		int x = Integer.parseInt(s);
		return x;
	}

	public static Job getJob(Scanner in) { /*Given in SimulationStub*/
		String[] s = in.nextLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int d = Integer.parseInt(s[1]);
		return new Job(a, d);
	}
}
