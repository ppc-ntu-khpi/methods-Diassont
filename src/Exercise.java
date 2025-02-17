//package domain;

public class Exercise {
    /**
     * Виконує XOR-шифрування або дешифрування вхідного рядка за допомогою ключа.
     * @param input Вхідний рядок, який потрібно зашифрувати або розшифрувати.
     * @param key Ключ для XOR-операції.
     * @return Зашифрований або розшифрований рядок.
     */
    public static String encryptXOR(String input, String key) {
        StringBuilder output = new StringBuilder();
        int keyLength = key.length();
        
        for (int i = 0; i < input.length(); i++) {
            output.append((char) (input.charAt(i) ^ key.charAt(i % keyLength)));
        }
        return output.toString();
    }
}

