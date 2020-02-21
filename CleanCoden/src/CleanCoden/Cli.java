package CleanCoden;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class Cli {
	public static void main(String[] args) {
        try (PrintStream out = new PrintStream(new FileOutputStream(FileDescriptor.out))) {
			deposit deposit = new deposit((double) 20000, 5, 6.8);
			Double simpleInterest = deposit.simpleInterest();
			Double compoundInterest = deposit.comPoundInterest();
			out.println("Simple Interest is: " + simpleInterest);
			out.println("Compound Interest is: " + compoundInterest);
		}
    }

}

