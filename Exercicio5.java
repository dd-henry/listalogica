
import javax.swing.JOptionPane;

/*5. Tendo como dados de entrada a altura e o sexo de uma pessoa,
construir um programa em que calcule seu peso ideal, 
utilizando as seguintes fórmulas: 
                        Para homens: (72.7*h) - 58 
                        Para mulheres: (62.1*h) - 44.7 (h = altura) 
*/

public class Exercicio5 {
    public static void main(String[] args){
        double pesoideal, altura;
        String[] options = {"Masculino", "Feminino"};//lista para as opções que serão dadas no JOptionPane

        //recebe a altura e transforma em numero inteiro
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite sua altura em cm"));
        //recebe um input de escolha
        var sexo = JOptionPane.showOptionDialog(null, "Selecione seu sexo", null, 0, 3, null, options, options[0]);

        /*  se sexo for igual a primeira opção (0 pq é contado a partir de 0)
        realizar a formula masculina*/
        if (sexo == 0) {
            pesoideal = (72.7 * (altura/100)) - 58.0;
            JOptionPane.showMessageDialog(null, "Seu peso ideal é: " + pesoideal + "kg");
        }else{//caso contrario realizar a formula feminina
            pesoideal = (62.1 * (altura/100)) - 44.7;
            JOptionPane.showMessageDialog(null, "Seu peso ideal é: " + pesoideal + "kg");
        }



    }
}
