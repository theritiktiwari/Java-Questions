import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        bw.write("No. of Bytes of data in the input file: " + br.read() + "\n");
        String line = br.readLine();
        int sentenceCount = 0, wordCount = 0;
        while (line != null) {
            String[] sentences = line.split("[!?.:]+");
            sentenceCount += sentences.length;
            String[] words = line.split(" ");
            wordCount = words.length;
            line = br.readLine();
        }
        bw.write("No. of sentences in the input file: " + sentenceCount + "\n");
        bw.write("No. of words in the input file: " + wordCount);
        System.out.println("Code executed successfully");
        br.close();
        bw.close();
    }
}