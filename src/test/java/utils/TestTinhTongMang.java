package utils;

import com.example.ktnc.util.tinhTongMang;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTinhTongMang {
    tinhTongMang tinh=  new tinhTongMang();
@Test
    public void testTinhTongMangNguyenDuong(){
        int exp=45;
        int act= tinh.tinhTongMangSoNguyen(new int[]{1,4,7,9,10,14});
    Assertions.assertEquals(exp,act);
    }@Test
    public void testTinhTongMangNguyenAm(){
        int exp= -45;
        int act= tinh.tinhTongMangSoNguyen(new int[]{-1,-4,-7,-9,-10,-14});
    Assertions.assertEquals(exp,act);
    }
//    @Test
//    public void testTinhTongMangNguyenChua_0(){
//        int exp=45;
//        int act= tinh.tinhTongMangSoNguyen(new int[]{0,1,4,7,9,10,14});
//    Assertions.assertEquals(exp,act);
//    }
}
