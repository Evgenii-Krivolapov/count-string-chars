public class Main {
    private static Task task = new Task();
    private static final String text = "My birth day 4 May";

    public static void main(String[] args) {
        System.out.println(task.containsOnlyDigits(text));
        //Result = false
        System.out.println(task.countVowelsAndConsonants(text));
        //Result = {4=9}
        System.out.println(task.countOccurrencesOfACertainCharcter(text, text));
        //Result = -1
    }
}
