public class byteshift {
public static void main(String args[]) {
byte a = 64, b;
int i;
long l;
i = a << 2;
b = (byte) (a << 2);
l=a<<25;
System.out.println("Original value of a: " + a);
System.out.println("i and b and l: " + i + " " + b+" "+l);
}
}
