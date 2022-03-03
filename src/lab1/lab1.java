package lab1;

import java.util.Scanner;

public class lab1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Hello world");

		String ogogdol, test = null;

		String useg[] = new String[100];
		String temdegt[] = new String[100];
		int too[] = new int[100];
		String qwe = "", qwe1 = "", qwe2 = "", check = "";

		int b = 0;
		System.out.println("томъёо оруулна уу");
		Scanner data = new Scanner(System.in);
		ogogdol = data.nextLine().replaceAll(" ", "").concat("!");

		for (int i = 0; i < ogogdol.length(); i++) {

			String str = "";
			test = String.valueOf(ogogdol.charAt(i));
			if (test.equals("+") || test.equals("-") || test.equals("*") || test.equals("/") || test.equals("!")) {
				useg[b] = qwe;
				qwe1 = qwe;
				qwe = "";
				check = String.valueOf(ogogdol.charAt(i));
				temdegt[b] = test;
				b++;
			} else {
				str = String.valueOf(ogogdol.charAt(i));
				qwe = qwe + str;
			}

		}
		int number = 0;
		
		number = number + too[0];
		for (int i = 0; i < b; i++) {

			if (temdegt[i].equals("+")) {
				number = number + too[i + 1];
			} else if (temdegt[i].equals("-")) {
				number = number - too[i + 1];
			} else if (temdegt[i].equals("*")) {
				number = number * too[i + 1];
			} else if (temdegt[i].equals("/")) {
				number = number / too[i + 1];
			} else {
			}

		}
		System.out.println("Хариу = " + number);
	}

}