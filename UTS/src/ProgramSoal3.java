/*
 * Created By 21343019_Arafil Azmi
 */

import javax.swing.JOptionPane;

public class ProgramSoal3 {
    public static void main(String[] args) {
        int bilangan;
        String i;

        i = JOptionPane.showInputDialog("Masukan Bilangan : ");
        bilangan = Integer.parseInt(i);

        JOptionPane.showMessageDialog(null,"Bilangan yang anda inputkan adalah " +bilangan);

        if(bilangan >= 0)
        {
            JOptionPane.showMessageDialog(null, "Bilangan " +bilangan+ " Adalah Bilangan Positif");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Bilangan " +bilangan+ " Adalah Bilangan Negatif");
        }
    }
}
