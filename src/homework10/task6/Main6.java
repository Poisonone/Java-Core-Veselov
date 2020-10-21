package homework10.task6;

public class Main6 {
    public static void main(String... strings) {
        findWord("Paris in the the spring.Not that that is related.Why are you laughing? Are my my regular expressions THAT bad??");
    }

    public static void findWord(String para) {
        String[] words = para.split(" ");
        int finalCount = 0;
        int tempCount = 0;
        String mostlyUsedWord = null;
        for (String word : words) {
            tempCount = 0;
            for (String w : words) {
                if (word.equalsIgnoreCase(w)) {
                    tempCount++;
                }
            }
            if (tempCount >= finalCount) {
                finalCount = tempCount;
                mostlyUsedWord = word;
            }
        }
        System.out.println("mostlyUsedWord:: = " + mostlyUsedWord + " ,count:: = " + finalCount);
    }

}
