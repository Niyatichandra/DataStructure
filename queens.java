import java.util.Scanner;
public class queens {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[][] board=new boolean[n][n];
        boolean[] col=new boolean[n];
        boolean[] nd=new boolean[2*n-1];
        boolean[] rd=new boolean[2*n-1];
        solve(board,0,col,rd,nd,"");
    }
    public static void solve(boolean board[][],int row,boolean[] col,boolean[] rd,boolean[] nd,String asf) {
        if (row == board.length) {
            System.out.println(asf + ".");
            return;
        }
        for (int c = 0; c < board[0].length; c++) {
            if (col[c] == false && nd[row +c] == false && rd[row - c + board.length - 1]==false) {
                board[row][c] = true;
                col[c] = true;
                nd[row +c] = true;
                rd[row -c + board.length - 1] = true;

                solve(board, row + 1, col, nd, rd, asf + row + "-" + c + ",");
                board[row][c] = false;
                col[c] = false;
                nd[row +c] = false;
                rd[row - c + board.length - 1] = false;
            }

        }
    }
    }

