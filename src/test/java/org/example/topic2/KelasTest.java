package org.example.topic2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KelasTest {
    List<Integer> kelasA = new ArrayList<Integer>();
    List<Integer> kelasB = new ArrayList<Integer>();
    List<Integer> kelasC = new ArrayList<Integer>();
    @BeforeEach
    void init(){
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
    }
    @Test
    public void testjumlahMasingMasingKelaggaLulus(){
        String hasil = Kelas.jumlahMasingMasingKelaggaLulus(kelasA, kelasB, kelasC);

        String expected = "Kelas A =2 Kelas B =2 Kelas C =3";

        Assertions.assertEquals(expected, hasil);
    }

    @Test void testKelasPalingBanyakGaLulus(){
        String hasil = Kelas.chekKelasPalingBayakGaLulus(kelasA, kelasB, kelasC);

        String excpeted = "Kelas C";

        Assertions.assertEquals(excpeted, hasil);
    }

    @Test
    public void testGetMinGrade() {
        assertEquals(60, Kelas.NilaiTerendah(kelasA));
        assertEquals(40, Kelas.NilaiTerendah(kelasB));
        assertEquals(15, Kelas.NilaiTerendah(kelasC));
    }

    @Test
    public void testGetMaxGrade() {
        assertEquals(90, Kelas.NilaiTertinggi(kelasA));
        assertEquals(88, Kelas.NilaiTertinggi(kelasB));
        assertEquals(95, Kelas.NilaiTertinggi(kelasC));
    }

}