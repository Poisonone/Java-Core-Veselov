package homework10.task5;


import homework10.task6.Main6;

public class Main5 {
    public static void main(String... strings) {
        String str = "Me you .You you you .Me me .You you me і.";
        String[] sentences = str.split("\\.");
        for (String sentence : sentences) {
            Main6.findWord(sentence);
        }
    }

}
