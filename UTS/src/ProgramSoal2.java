/*
 * Created By 21343019_Arafil Azmi
 */

import java.util.Scanner;

public class ProgramSoal2 {
    public static void main(String[] args) {
    int i;
    int j;
    int jml_baris;

    System.out.print("TAMPILAN PROGRAM UTS SOAL NO 2 \n");
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan Jumlah Baris : ");
    jml_baris = input.nextInt();
    
    for (i=1; i<=jml_baris; i++)
    {
        for (j=1; j<=i; j++)
        {
            System.out.print(" ");
        }
            for (j=5; j>=i; j--)
            {
                System.out.print("#");
                System.out.print(" ");
            }
        System.out.println();
    }
    
    for (i=1; i<=jml_baris; i++)
    {
        for (j=5; j>=i; j--)
        {
            System.out.print(" ");
        }
            for (j=1; j<=i; j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
                System.out.println();
    }

    }
}
