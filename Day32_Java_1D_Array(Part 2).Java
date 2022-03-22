import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        boolean result = false;
        int n = game.length;
        ArrayList<Integer>ListPosisi = new ArrayList<>();
        ListPosisi.add(0);
        while(!ListPosisi.isEmpty()){
            int i = ListPosisi.get(0);
            game[i] = 1;
            ListPosisi.remove(0);
            
            //win
            if(i>=n-1 || i+leap>=n){
                result = true;
                break;
            }
            //mundur
            if(i-1>=0 && game[i-1]==0){
                ListPosisi.add(i-1);
            }
            //maju
            if(i+1<n && game[i+1]==0){
                ListPosisi.add(i+1);
            }
            //melompat
            if(i+leap<n && game[i+leap]==0){
                ListPosisi.add(i+leap);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
