import java.util.Scanner;

public class ApplicationUI {
    private Scanner scanner;
    private ApplicationManager application;

    public void run(){
        System.out.println("Welcome to the Internship Search App!");
    }

    private void displayMainMenu(){
    }

    public static void main(String[] args) {
		ApplicationUI ui = new ApplicationUI();
		ui.run();
	}
    
}
