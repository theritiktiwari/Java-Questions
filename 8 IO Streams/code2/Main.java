import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        bw.write("No. of Bytes of data in the input file: " + br.read() +  "\n");
        String line = br.readLine();
        int count = 0, sentenceCount = 0;
        while(line != null){
            String[] sentences = line.split("[!?.:]+");
            sentenceCount += sentences.length;
            String[] words = line.split(" ");
            for(String word : words){
                if(word.startsWith("J")){
                    count++;
                }
            }
            line = br.readLine();
        }
        bw.write("No. of sentences in the input file: " + sentenceCount + "\n");
        bw.write("No. of words starting with J in the input file: " + count);
        br.close();
        bw.close();
    }
}