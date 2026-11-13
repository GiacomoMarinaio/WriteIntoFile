import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
    public String ScriviDentroilFile(String testo){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleziona il file in cui salvare il testo");
        int selezioneutente = fileChooser.showSaveDialog(null);
        if(selezioneutente != JFileChooser.APPROVE_OPTION){
            System.out.println("Operazione annullatadell'utente.");
            return null;
        }
        File fileSelezionato = fileChooser.getSelectedFile();
        System.out.println("File selezionato " + fileSelezionato.getAbsolutePath());

        FileWriter scrittoreFile = null;
        try {
            scrittoreFile = new FileWriter(fileSelezionato);
            scrittoreFile.write(testo + System.lineSeparator());
            scrittoreFile.close();
        } catch (IOException e) {
            System.err.println(e);
        }

        return null;
    }
}
