import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    static final Pattern TEXT_INSIDE_TAGS_PATTERN = Pattern.compile("<(\\S+?)>(\\S+?)</\\1>");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        processHtml(input);
    }

    private static void processHtml(String html) {
        Matcher matcher = TEXT_INSIDE_TAGS_PATTERN.matcher(html);

        while (matcher.find()) {
            String textInsideTags = matcher.group(2);

            processHtml(textInsideTags);
            System.out.println(textInsideTags);
        }
    }
}
