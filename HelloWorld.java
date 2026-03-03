import java.util.HashMap;
import java.util.Map;

public class BannerAppUC7 {

    public static void main(String[] args) {

        String word = "OOPS";
        StringBuilder[] bannerLines = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        for (char c : word.toCharArray()) {

            String[] pattern = CharacterPatternMap.getPattern(c);

            for (int i = 0; i < 7; i++) {
                bannerLines[i].append(pattern[i]).append("  ");
            }
        }

        for (StringBuilder line : bannerLines) {
            System.out.println(line.toString());
        }
    }

    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    static class CharacterPatternMap {

        private static Map<Character, CharacterPattern> patternMap = new HashMap<>();

        static {

            patternMap.put('O', new CharacterPattern('O', new String[]{
                    " *** ",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*   *",
                    " *** "
            }));

            patternMap.put('P', new CharacterPattern('P', new String[]{
                    "**** ",
                    "*   *",
                    "*   *",
                    "**** ",
                    "*    ",
                    "*    ",
                    "*    "
            }));

            patternMap.put('S', new CharacterPattern('S', new String[]{
                    " ****",
                    "*    ",
                    "*    ",
                    " *** ",
                    "    *",
                    "    *",
                    "**** "
            }));
        }

        public static String[] getPattern(char c) {
            return patternMap.get(c).getPattern();
        }
    }
}