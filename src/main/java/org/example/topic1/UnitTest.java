package org.example.topic1;

public class UnitTest {

    public Integer tambah(Integer a, Integer b){
        return a + b;
    }

    public Integer kurang(Integer a, Integer b){
        return a - b;
    }

    public String appender(Integer loopCount){
        String akhir = "";
        if (loopCount < 1){
            return "salah";
        }
        for (int i = 0; i < loopCount; i++){
            akhir += "a";
        }
        return akhir;
    }
}
