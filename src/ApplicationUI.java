import java.util.Scanner;

public class ApplicationUI {
    private Scanner scanner;
    private ApplicationManager application;

    public void run(){
        System.out.println("> Welcome to the Internship Search App!");
        displayMainMenu();
    }

    private void displayMainMenu(){
        System.out.print("\n \n*******Main Menu******* \n1. Login\n2. Exit\n \nWhat would you like to do?: ");
        scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        //Next line included for testing purposes
        System.out.print(input);
    }

    public static void main(String[] args) {
		ApplicationUI ui = new ApplicationUI();
		ui.run();
	}
    
}
