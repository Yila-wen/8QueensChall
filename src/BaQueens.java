import java.util.Arrays;

import java.util.Arrays;
public class BaQueens {

    private String[][] grid;
    private int size;
    private int queens;

    public BaQueens (int n){
        grid = new String[n][n];
        size = n;
        queens = n;
    }

    public String[][] solver(){
        String[][] solutions = new String[size][size];




return solutions;
    }


    private void queenMovement(String[][] g, int r, int c){
        g[r][c] = "Q";
        for (int i =0;i<g[r].length;i++){
            g[r][c] = "X";
        }
        for (int i=0;i<g.length;i++){
            g[i][c]="X";
        }
        int d = 0;
        if(r<c){d = r;}
        else if (c<r){d = c;}
        else d = r;

        int tR = r-d;
        int tC = c-d;
        while (tR <g[0].length || tC <g.length){
            g[tR][tC] = "X";
            tR++;
            tC++;
        }


        int ttR = r-d;
        int ttC = c+d;
        while (ttR <g[0].length || ttC >-1){
            g[ttR][ttC] = "X";
            ttR--;
            ttC++;
        }



        }




    public void printGrid(){
        for (int i=0;i<queens;i++){
        System.out.println(Arrays.toString(grid[i]));
    }
    }
}
