
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan golongan (A/B/C): ");
        String golongan = input.next().toUpperCase();

        System.out.print("Masukkan jam lembur (1-5): ");
        int jamLembur = input.nextInt();

        double gajiPokok;
        double persenLembur;

        if (golongan.equals("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equals("B")) {
            gajiPokok = 6500000;
        } else if (golongan.equals("C")) {
            gajiPokok = 9500000;
        } else {
            System.out.println("Golongan tidak valid!");
            input.close();
            return;
        }

        switch (jamLembur) {
            case 1: persenLembur = 0.30; break;
            case 2: persenLembur = 0.32; break;
            case 3: persenLembur = 0.34; break;
            case 4: persenLembur = 0.36; break;
            case 5: persenLembur = 0.38; break;
            default:
                System.out.println("Jam lembur harus 1 sampai 5!");
                input.close();
                return;
        }

        double gajiLembur = gajiPokok * persenLembur;
        double totalPenghasilan = gajiPokok + gajiLembur;

        System.out.println("Gaji Pokok: Rp" + gajiPokok);
        System.out.println("Gaji Lembur: Rp" + gajiLembur);
        System.out.println("Total Penghasilan: Rp" + totalPenghasilan);

        input.close();
    }
}