public class Exercicio2 {
    public static void main(String[] args){
        int A, B, C;
        boolean Q1, Q2, Q3, Q4, Q5;

        A = 3;
        B = 7;
        C = 4;

        Q1 = ((A + C) > B);
        Q2 = B >= (A + 2);
        Q3 = C == (B - A);
        Q4 = (B + A) <= C;
        Q5 = (C + A) > B;

        System.out.println("A = 3    B = 7    C = 4");
        System.out.println("((A + C) > B)   -->  (" + Q1 + ")");
        System.out.println("B >= (A + 2)   -->  (" + Q2 + ")");
        System.out.println("C == (B - A)   -->  (" + Q3 + ")");
        System.out.println("(B + A) <= C   -->  (" + Q4 + ")");
        System.out.println("(C + A) > B   -->  (" + Q5 + ")");
    }
}
