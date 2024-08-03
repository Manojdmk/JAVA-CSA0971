class SpecialCharacter {
    public static void main(String arg[]) {
        String line = "Hello, World! Welcome to @2024 #Java$Programming%";
        int specialCharCount = 0;
        StringBuilder specialCharacters = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharacters.append(ch).append(" ");
                specialCharCount++;
            }
        }
        System.out.println("Special characters: " + specialCharacters.toString());
        System.out.println("Count of special characters: " + specialCharCount);
    }
}
