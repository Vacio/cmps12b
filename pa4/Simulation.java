import java.io.*;
import java.util.Scanner;

public class Simulation {
	public static void main(String[] args) throws IOException {

		/*Variables*/
		String jobs = null /*Number of jobs, first line of input*/
		Queue StorageC = new Queue(); /*Stores jobs from inFile*/
		Queue Storage = new Queue();

		/*Check command line arguments*/
		if (args.length < 1 || > 2) {
			System.out.println("Usage: Simultation infile");
			System.exit(1);
		}

		/*input*/
		Scanner sc = new Scanner(new File(args[0]));
		PrintWriter report = new PrintWriter(new FileWriter(args[0] + ".rpt"));
		PrintWriter trace = new PrintWriter(new FileWriter(args[0] + ".trc"));

		m = numOfJobs(sc);

		while(sc.hasNextLine()) {
			storageC.enqueue((Job)getJob(sc));
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
