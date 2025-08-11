package day2;

public class leftrightshift {
    public static void main(String[] args) {
        int a = 15; // 0000 1000 in binary
        int b = 2; // 0000 0010 in binary

        // Left shift operator
        System.out.println("Left Shift:");
        System.out.println("a << b: " + (a << b)); // 60, which is 0010 0000 in binary

        // Right shift operator
        System.out.println("Right Shift:");
        System.out.println("a >> b: " + (a >> b)); // 3, which is 0000 0010 in binary
    }
    
}
