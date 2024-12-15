public class PrimitiveWrappersCasting {
    public static void main(String[] args) {
        byte b = 3;
        short s = 6;
        int i = 10;
        long l = 8L;
        float f = 6.f;
        double d = 3.;

        Byte B = 3;
        Short S = 5;
        Integer I = 12;
        Long L = 9L;
        Float F = 10.f;
        Double D = 12.3;

        String st = "15";

        // 1. l = b / i + Integer.parseInt(st);
        l = (long) (b / i + Integer.parseInt(st)); // Cast result to long
        System.out.println("l= " + l);

        // 2. f = d + i - 5;
        f = (float) (d + i - 5); // Cast result to float
        System.out.println("f= " + f);

        // 3. s = B + 6;
        s = (short) (B + 6); // Cast result to short
        System.out.println("s= " + s);

        // 4. b = 506 + s;
        b = (byte) (506 + s); // Cast result to byte
        System.out.println("b= " + b);

        // 5. i = (b + S) / Integer.parseInt(st);
        i = (b + S) / Integer.parseInt(st);
        System.out.println("i= " + i);

        // 6. d += f + 3.f - S.doubleValue() * b;
        d += f + 3.f - S.doubleValue() * b;
        System.out.println("d= " + d);

        // 7. B = (byte) 15 + S;
        B = (byte) ((byte) 15 + S); // Cast result to byte
        System.out.println("B= " + B);

        // 8. S = B + 2 - Double.parseDouble(st);
        S = (short) (B + 2 - Double.parseDouble(st)); // Cast result to short
        System.out.println("S= " + S);

        // 9. I = B + S / I;
        I = B + S / I;
        System.out.println("I= " + I);

        // 10. L = (long) (I + 5); // Cast result to long to assign to Long
        L = (long) (I + 5);
        System.out.println("L= " + L);

        // 11. F = (float) (I * B - 3 % 8 * S);
        F = (float) (I * B - 3 % 8 * S);
        System.out.println("F= " + F);

        // 12. D = (double) (F + I - 6 / B + Float.parseFloat(st));
        D = (double) (F + I - 6 / B + Float.parseFloat(st)); // Cast result to double
        System.out.println("D= " + D);
    }
}
