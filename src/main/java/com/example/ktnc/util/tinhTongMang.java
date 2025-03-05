package com.example.ktnc.util;

public class tinhTongMang {

    public int tinhTongMangSoNguyen(int [] soNguyen){
        int sum =0;
        for(int i: soNguyen){
//            if (soNguyen [i]<100 && soNguyen [i]%2 !=0){
//            sum+=i;
//            }
            sum+=i;
        }
        return sum;
    }
}
