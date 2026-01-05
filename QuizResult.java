import java.io.*;

public class QuizResult {

    public static void saveResult(String name, int score) {
        try {
            FileWriter fw = new FileWriter("results.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(name + "," + score);
            bw.newLine();
            bw.close();

        } catch (Exception e) {
            System.out.println("Error saving result");
        }
    }

    public static void readResults() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("results.txt"));
            String line;

            System.out.println("\n--- Stored Results ---");
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("Name: " + data[0] + " | Score: " + data[1]);
            }
            br.close();

        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}

