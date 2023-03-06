import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("song.txt");
        fileWriter.write("Ты не такая как все.\nNurik Barmakov.\nТы подходи ко мне, жизнь моя дорогая\nСловно повесть на руке\nЯ не могу без тебя, спешу к тебе\nТы не такая как все");
        fileWriter.close();
        try {
            FileReader fileReader = new FileReader("song.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.next());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}