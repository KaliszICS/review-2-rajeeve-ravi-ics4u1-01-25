import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
        System.out.print("In: " );
        String str = input.nextLine();
        System.out.print(str + "\n");
		
	}

	public static void q2() {
        Scanner input = new Scanner(System.in);
        System.out.print("In: ");
        int num = input.nextInt();
        int num2 = input.nextInt();
        int num3 = num / num2;
        int num4 = num % num2;
        System.out.print("In: " + num3 + "\n" + num4 + "\n");

	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
        System.out.print("In: ");
        String str = input.nextLine();
        System.out.print(str + " was the text you wrote" + "\n");

		
	}

	public static void q4() {
        Scanner input = new Scanner(System.in);
        System.out.print("In: ");
        int num = input.nextInt();
        num = num * 5;
        System.out.print(num + "\n");

	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
        System.out.print("In: ");
        boolean bool = input.nextBoolean();
        System.out.print(bool + " is a boolean" + "\n");
		
	}

	public static void q6() {
        Scanner input = new Scanner(System.in);
        System.out.print("In: ");
        double num = input.nextDouble();
        System.out.print(num - 3.2 + "\n");
		
	}

}
