//package test;

//import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        String phrase = "Hello, my name is Yaroslav!";
        String key = "key";

        // Шифрування
        String encrypted = Exercise.encryptXOR(phrase, key);
        System.out.println("Зашифрований текст: " + encrypted);

        // Розшифрування (використовуємо той самий метод, бо XOR є симетричним)
        String decrypted = Exercise.encryptXOR(encrypted, key);
        System.out.println("Розшифрований текст: " + decrypted);
    }
}
