package lab02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String skip;
        
        for(int i = 0; i < t; i++){
            int m = sc.nextInt();
            csStudent[] at = new csStudent[m];
            
            int n = sc.nextInt();
            itStudent[] ct = new itStudent[n];
            
            int p = sc.nextInt();
            etStudent[] dt = new etStudent[p];
            
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            for(int j = 0; j < m; j++){
                skip = sc.nextLine();
                at[j] = new csStudent(sc.nextLine(), "ATTT", sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            }
            
            for(int j = 0; j < n; j++){
                skip = sc.nextLine();
                ct[j] = new itStudent(sc.nextLine(), "CNTT", sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            }
            
            for(int j = 0; j < p; j++){
                skip = sc.nextLine();
                dt[j] = new etStudent(sc.nextLine(), "DTVT", sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            }
            
            at[x].xuatThongTin();
            ct[y].xuatThongTin();
            dt[z].xuatThongTin();
        }
    }
}
