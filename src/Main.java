import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WriteIntoFile writeIntoFile = new WriteIntoFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi qualcosa ");
        String testo = scanner.nextLine();

        writeIntoFile.ScriviDentroilFile(testo);
    }
}