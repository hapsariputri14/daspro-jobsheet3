public class ContohOperator23 {
    public static void main (String [] args){
        int x = 10;
        System.out.println("x++ = " + x++);
        System.out.println("Setelah evaluasi, x = " + x);
        x = 10;
        System.out.println("++x = " + ++x);
        System.out.println("Setelah evaluasi, X = " + x);
        int Y = 12;
        System.out.println(x > Y || Y == x && Y <= x);
        int Z = x ^ Y;
        System.out.println("\nHasil X ^ Y adalah " + Z);
        Z %= 2;
        System.out.println("Hasil akhir " + Z);
    }
}
