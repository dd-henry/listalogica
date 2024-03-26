
//3. Sabendo que A=5, B=4, C=3 e D=6, informe se as expressões abaixo são verdadeiras ou falsas.
public class Exercicio3 {
    public static void main(String[] args){
        int A, B, C, D;
        boolean Q1, Q2, Q3;

        A = 5;
        B = 4;
        C = 3;
        D = 6;

        Q1 = (A > C) && (C <= D);
        Q2 = (A+B) > 10 || (A+B) == (C+D);
        Q3 = (A>=C) && (D >= C) ;


        System.out.println("A = 5    B = 4    C = 3    D = 6");
        System.out.println("(A > C) && (C <= D)   -->  (" + Q1 + ")");
        System.out.println("(A + B) > 10 || (A + B) == (C + D)   -->  (" + Q2 + ")");
        System.out.println("(A >= C) && (D >= C)   -->  (" + Q3 + ")");


    }
}
