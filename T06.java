// 12S22012 - Reinhard Batubara
// 12S22039 - Meilyna S.A.Hutajulu

import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, k, tot;
        String kalimat;
        
        kalimat = input.nextLine();
        tot = kalimat.length();
        String[] data = new String[tot];
        
        kalimat(tot, kalimat, data);
        k = 0;
        i = tot - 1;
        boolean jawab;
        
        jawab = true;
        while (tot >= 1 && jawab == true) {
            if (data[k].equals(data[i])) {
                jawab = true;
                i = i - 1;
                k = k + 1;
                tot = tot - 2;
            } else {
                jawab = false;
            }
        }
        if (jawab) {
            jawab2();
        } else {
            jawab1();
        }
    }
    
    public static void i() {
    }
    
    public static void jawab1() {
        System.out.println("NO");
    }
    
    public static void jawab2() {
        System.out.println("YES");
    }
    
    public static void kalimat(int tot, String kalimat, String[] data) {
        int i;
        
        tot = kalimat.length();
        for (i = 0; i <= tot - 1; i++) {
            data[i] = String.valueOf(kalimat.charAt(i));
        }
    }
}

