package homework10.task5;

public class Main5 {
    public static void main(String... strings) {
        String str = "Me you . You you you . Me me . You you me і.";
        String[] words = str.split(" ");
        String[] sentences = str.split("\\.");
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
        System.out.println("mostlyUsedWord = " + "'" + mostlyUsedWord + "'" + " quantity = " + finalCount);
    }
}
