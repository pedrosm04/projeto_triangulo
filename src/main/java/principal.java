



import javax.swing.JOptionPane;
public class principal {

    public static void main(String[] args) {
        //variaveis
        double base,altura,area;
        //entrada
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));
        //processamento
        area = (base * altura)/2.0;
        //saida
        JOptionPane.showMessageDialog(null, "a area é " + area);
        
    }
}
