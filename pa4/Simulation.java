import java.io.*;
import java.util.Scanner;

public class Simulation {
	public static void main(String[] args) throws IOException {

		/*Variables*/
		Scanner sc = null;
		PrintWriter report = null;
		PrintWriter trace = null;
		//String numJobs = null; /*Number of jobs, first line of input*/
		Queue StorageC = new Queue();
		Queue Storage = new Queue();
		int m = 0;
		Job j = null;

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

		/*Get num of jobs*/
		m = numOfJobs(sc);
		//numJobs = sc.nextLine();
		//m = Integer.parseInt(numJobs);

		while(sc.hasNextLine()) {
			j = getJob(sc);
			StorageC.enqueue(j);
		}

		/*Trace and Report*/
		trace.println("Trace file: " + (args[0] + ".trc"));
		trace.println(m + " Jobs:");
		trace.println(StorageC.toString());
		trace.println();

		report.println("Report file: " + (args[0] + ".rpt"));
		report.println(m + " Jobs:");
		report.println(StorageC.toString());
		report.println();
		report.println("***********************************************************");

		/*Main simulation loop from (1,m-1)*/
		for(int n = 1; n < m; n++) { /*Creates one less proccess than jobs*/
			int totalWait = 0;
			int maxWait = 0;
			double avgWait = 0.00;
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
