package share.codes.railFenceCipher;

public class RailCipher {
    public Character[][] encode(String message, Integer numberOfRow) {
        Boolean flag = true;
        Integer row = 0;
        Character[][] cipherText = new Character[numberOfRow][message.length()];
        initializeArray(cipherText, message, numberOfRow);
        for (int column = 0; column < message.length(); column++) {
            if (flag) {
                cipherText[row][column] = message.charAt(column);
                row++;
                if (row.equals(numberOfRow)) {
                    flag = false;
                    row--;
                }
            } else {
                if (!row.equals(0)) {
                    row--;
                }
                cipherText[row][column] = message.charAt(column);
                if (row.equals(0)) {
                    flag = true;
                    row = 1;
                }
            }
        }
        displayCipherText(message, numberOfRow, cipherText);
        return cipherText;
    }

    private void displayCipherText(String message, Integer numberOfRow, Character[][] cipherText) {
        Integer row;
        for (row = 0; row < numberOfRow; row++) {
            for (int column = 0; column < message.length(); column++) {
                System.out.print(cipherText[row][column]);
            }
            System.out.println();
        }
    }

    private Character[][] initializeArray(Character[][] cipherText, String message, Integer numberOfRow) {
        for (int row = 0; row < numberOfRow; row++) {
            for (int column = 0; column < message.length(); column++) {
                cipherText[row][column] = ' ';
            }
        }
        return cipherText;
    }
}
