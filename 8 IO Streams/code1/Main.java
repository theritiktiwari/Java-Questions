import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line = br.readLine();
        int wordCount = 0;
        int sentenceCount = 0;
        while (line != null) {
            String[] words = line.split(" ");
            wordCount += words.length;
            String[] sentences = line.split("[!?.:]+");
            sentenceCount += sentences.length;
            line = br.readLine();
        }
        System.out.println("Number of words : " + wordCount);
        System.out.println("Number of sentences : " + sentenceCount);
    }
}