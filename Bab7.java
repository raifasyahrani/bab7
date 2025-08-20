package bab7;

import javax.swing.JOptionPane;

public class Bab7 {

    public static void main(String[] args) {

        // Cara Deklarasi Array String
        String[] nama1;
        String nama2[];
        String[] nama3 = new String[2];

        // Inisialisasi Array 1 Dimensi
        String[] nama = new String[3];
        nama[0] = "Budi";
        nama[1] = "Andi";
        nama[2] = "Dwi";

        System.out.println("Index 0 : " + nama[0]);
        System.out.println("Index 1 : " + nama[1]);
        System.out.println("Index 2 : " + nama[2]);

        // Input Nama Menggunakan JOptionPane
        String[] namaInput = new String[3];
        namaInput[0] = JOptionPane.showInputDialog(null, "Nama :", "index ke-0", JOptionPane.INFORMATION_MESSAGE);
        namaInput[1] = JOptionPane.showInputDialog(null, "Nama :", "index ke-1", JOptionPane.INFORMATION_MESSAGE);
        namaInput[2] = JOptionPane.showInputDialog(null, "Nama :", "index ke-2", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, namaInput[0] + ", " + namaInput[1] + ", " + namaInput[2]);

        // Array 2 Dimensi (Nama & Umur)
        String[][] umur = new String[2][2];
        umur[0][0] = "Budi";
        umur[0][1] = "20";
        umur[1][0] = "Andi";
        umur[1][1] = "45";

        System.out.println("Nama : " + umur[0][0] + " umur : " + umur[0][1]);
        System.out.println("Nama : " + umur[1][0] + " umur : " + umur[1][1]);
    }
}