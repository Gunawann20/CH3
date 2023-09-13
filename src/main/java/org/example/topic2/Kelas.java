package org.example.topic2;

import java.util.*;

public class Kelas {


    public static void main(String[] args) {

        List<Integer> kelasA = new ArrayList<>();
        List<Integer> kelasB = new ArrayList<>();
        List<Integer> kelasC = new ArrayList<>();
        kelasA.add(90);
        kelasA.add(85);
        kelasA.add(89);
        kelasA.add(77);
        kelasA.add(68);
        kelasA.add(88);
        kelasA.add(80);
        kelasA.add(90);
        kelasA.add(45);
        kelasA.add(70);

        kelasB.add(80);
        kelasB.add(85);
        kelasB.add(88);
        kelasB.add(55);
        kelasB.add(40);

        kelasC.add(85);
        kelasC.add(50);
        kelasC.add(95);
        kelasC.add(35);
        kelasC.add(15);

        System.out.print("Jumlah tidak lulus masing masing kelas: ");
        System.out.println(jumlahMasingMasingKelaggaLulus(kelasA, kelasB, kelasC));
        System.out.println();
        System.out.print("Kelas yang paling banyak tidak lulus: ");
        System.out.println(chekKelasPalingBayakGaLulus(kelasA, kelasB, kelasC));
        System.out.println();

        int minGradeA = NilaiTerendah(kelasA);
        int minGradeB = NilaiTerendah(kelasB);
        int minGradeC = NilaiTerendah(kelasC);

        System.out.println("Nilai terendah di Kelas A: " + minGradeA);
        System.out.println("Nilai terendah di Kelas B: " + minGradeB);
        System.out.println("Nilai terendah di Kelas C: " + minGradeC);

        System.out.println();

        int maxGradeA = NilaiTertinggi(kelasA);
        int maxGradeB = NilaiTertinggi(kelasB);
        int maxGradeC = NilaiTertinggi(kelasC);

        System.out.println("Nilai tertinggi di Kelas A: " + maxGradeA);
        System.out.println("Nilai tertinggi di Kelas B: " + maxGradeB);
        System.out.println("Nilai tertinggi di Kelas C: " + maxGradeC);
    }
    public static String jumlahMasingMasingKelaggaLulus(List<Integer> kelasA, List<Integer> kelasB, List<Integer> kelasC){
        int jmlKelasA = 0;
        int jmlKelasB = 0;
        int jmlKelasC = 0;

        for (Integer nilai : kelasA){
            if (nilai < 70 ){
                jmlKelasA +=1;
            }
        }
        for (Integer nilai : kelasB){
            if (nilai < 70 ){
                jmlKelasB +=1;
            }
        }
        for (Integer nilai : kelasC){
            if (nilai < 70 ){
                jmlKelasC +=1;
            }
        }

        return "Kelas A =" + jmlKelasA + " Kelas B ="+ jmlKelasB +" Kelas C ="+ jmlKelasC;
    }
    public static int NilaiTertinggi(List<Integer> kelas){
        return Collections.max(kelas);
    }

    public static int NilaiTerendah(List<Integer> kelas) {
        return Collections.min(kelas);
    }

    public static String chekKelasPalingBayakGaLulus(List<Integer> kelasA, List<Integer> kelasB, List<Integer> kelasC){
        int jmlKelasA = 0;
        int jmlKelasB = 0;
        int jmlKelasC = 0;

        for (Integer nilai : kelasA){
            if (nilai < 70 ){
                jmlKelasA +=1;
            }
        }
        for (Integer nilai : kelasB){
            if (nilai < 70 ){
                jmlKelasB +=1;
            }
        }
        for (Integer nilai : kelasC){
            if (nilai < 70 ){
                jmlKelasC +=1;
            }
        }
        if (jmlKelasA > jmlKelasB & jmlKelasA > jmlKelasC){
            return "Kelas A";
        } else if (jmlKelasB > jmlKelasA & jmlKelasB > jmlKelasC) {
            return "Kelas B";
        } else {
            return "Kelas C";
        }
    }
}
