package Converter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("수를 입력하세요: ");
        String input = scanner.nextLine();
        
        Main converter = new Main();
        
        if (converter.isBinary(input)) {
            System.out.println("2진수: " + input);
            System.out.println("10진수: " + converter.binaryToDecimal(input));
            System.out.println("8진수: " + converter.binaryToOctal(input));
            System.out.println("16진수: " + converter.binaryToHexadecimal(input));
        } else if (converter.isOctal(input)) {
            System.out.println("8진수: " + input);
            System.out.println("10진수: " + converter.octalToDecimal(input));
            System.out.println("2진수: " + converter.octalToBinary(input));
            System.out.println("16진수: " + converter.octalToHexadecimal(input));
        } else if (converter.isDecimal(input)) {
            System.out.println("10진수: " + input);
            System.out.println("2진수: " + converter.decimalToBinary(input));
            System.out.println("8진수: " + converter.decimalToOctal(input));
            System.out.println("16진수: " + converter.decimalToHexadecimal(input));
        } else if (converter.isHexadecimal(input)) {
            System.out.println("16진수: " + input);
            System.out.println("10진수: " + converter.hexadecimalToDecimal(input));
            System.out.println("2진수: " + converter.hexadecimalToBinary(input));
            System.out.println("8진수: " + converter.hexadecimalToOctal(input));
        } else {
            System.out.println("입력 값이 올바르지 않습니다.");
        }
        
        scanner.close();
    }
    
    // Check if the input is a binary number
    public boolean isBinary(String input) {
        return input.matches("[01]+");
    }
    
    // Check if the input is an octal number
    public boolean isOctal(String input) {
        return input.matches("[0-7]+");
    }
    
    // Check if the input is a decimal number
    public boolean isDecimal(String input) {
        return input.matches("[0-9]+");
    }
    
    // Check if the input is a hexadecimal number
    public boolean isHexadecimal(String input) {
        return input.matches("[0-9A-Fa-f]+");
    }
    
    // Convert binary to decimal
    public int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
    
    // Convert binary to octal
    public String binaryToOctal(String binary) {
        int decimal = binaryToDecimal(binary);
        return decimalToOctal(Integer.toString(decimal));
    }
    
    // Convert binary to hexadecimal
    public String binaryToHexadecimal(String binary) {
        int decimal = binaryToDecimal(binary);
        return decimalToHexadecimal(Integer.toString(decimal));
    }
    
    // Convert octal to decimal
    public int octalToDecimal(String octal) {
        int decimal = 0;
        int power = 0;
        for (int i = octal.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(octal.charAt(i));
            decimal += digit * Math.pow(8, power);
            power++;
        }
        return decimal;
    }
    
    // Convert octal to binary
    public String octalToBinary(String octal) {
        int decimal = octalToDecimal(octal);
        return decimalToBinary(Integer.toString(decimal));
    }
    
    // Convert octal to hexadecimal
    public String octalToHexadecimal(String octal) {
        int decimal = octalToDecimal(octal);
        return decimalToHexadecimal(Integer.toString(decimal));
    }
    
    // Convert decimal to binary
    public String decimalToBinary(String decimal) {
        int value = Integer.parseInt(decimal);
        StringBuilder binary = new StringBuilder();
        while (value > 0) {
            binary.insert(0, value % 2);
            value /= 2;
        }
        return binary.toString();
    }
    
    // Convert decimal to octal
    public String decimalToOctal(String decimal) {
        int value = Integer.parseInt(decimal);
        StringBuilder octal = new StringBuilder();
        while (value > 0) {
            octal.insert(0, value % 8);
            value /= 8;
        }
        return octal.toString();
    }
    
    // Convert decimal to hexadecimal
    public String decimalToHexadecimal(String decimal) {
        int value = Integer.parseInt(decimal);
        StringBuilder hexadecimal = new StringBuilder();
        while (value > 0) {
            int remainder = value % 16;
            if (remainder < 10) {
                hexadecimal.insert(0, remainder);
            } else {
                char hexChar = (char) ('A' + (remainder - 10));
                hexadecimal.insert(0, hexChar);
            }
            value /= 16;
        }
        return hexadecimal.toString();
    }
    
    // Convert hexadecimal to decimal
    public int hexadecimalToDecimal(String hexadecimal) {
        int decimal = 0;
        int power = 0;
        for (int i = hexadecimal.length() - 1; i >= 0; i--) {
            char hexChar = hexadecimal.charAt(i);
            int digit = Character.isDigit(hexChar) ? hexChar - '0' : 10 + Character.toUpperCase(hexChar) - 'A';
            decimal += digit * Math.pow(16, power);
            power++;
        }
        return decimal;
    }
    
    // Convert hexadecimal to binary
    public String hexadecimalToBinary(String hexadecimal) {
        int decimal = hexadecimalToDecimal(hexadecimal);
        return decimalToBinary(Integer.toString(decimal));
    }
    
    // Convert hexadecimal to octal
    public String hexadecimalToOctal(String hexadecimal) {
        int decimal = hexadecimalToDecimal(hexadecimal);
        return decimalToOctal(Integer.toString(decimal));
    }
}
//10이나 100같은 1과0으로 받는게 공통인 수를 받았을 때 10진수인지 2진수인지 다시 물어본다
//파일구조로 정리해서 프로젝트화 해라
//Integer 메서드 없이도 구현이 가능한지 알아보자
