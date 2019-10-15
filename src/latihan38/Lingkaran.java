/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan38;

/**
 *
 * @author lutfi
 */
class Lingkaran {
    public static final float PHI = (float)3.14;
    private float jarijari, diameter, keliling, luas;
    
    private float HitungJariJari(){
        jarijari = keliling/(2*PHI);
        return jarijari;
    }
    
    private float HitungKeliling(){
        keliling = (float)PHI*diameter;
        return keliling;
    }
    
    private float HitungLuas(){
        luas = (float) ((0.25)*PHI*diameter*diameter);
        return luas;
    }
    
    public void hitungLingkaran(float diameter){
        this.diameter = diameter;
        System.out.println("===Hasil Perhitungan Lingkaran===");
        HitungKeliling();
        HitungLuas();
        HitungJariJari();
        System.out.println("Jari-jari Lingkaran = "+jarijari+" cm");
        System.out.println("Luas Lingkaran = "+luas+" cm");
        System.out.println("Keliling Lingkaran = "+keliling+" cm");
    }
}
