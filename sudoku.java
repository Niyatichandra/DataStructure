import java.util.Scanner;
public class sudoku {
    public static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length;j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void solve(int[][] board, int i, int j) {
        if(i==board.length)
        {
            display(board);
            return;
        }
        int ni = 0;
        int nj = 0;
        if (j == board[0].length - 1) {
            ni = i + 1;
            j = 0;
        } else {
            ni = i;
            nj = j + 1;
        }
        if (board[i][j] != 0) {
            solve(board, ni, nj);
        } else {
            for (int po = 1; po <= 9; po++) {
                if (valid(board, i, j, po) == true) {
                    board[i][j] = po;
                    solve(board, ni, nj);
                    board[i][j] = 0;

                }
            }
        }
    }
    public static boolean valid(int[][] board,int x,int y,int val)
    {
        for(int j=0;j<board[0].length;j++)
        {
            if(board[x][j]==val)
            {
                return false;
            }
        }
        for(int i=0;i<board.length;i++)
        {
            if(board[i][y]==val)
            {
                return false;
            }

        }
        int mati=x/3*3;
        int matj=y/3*3;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[mati+i][matj+j]==val)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr=new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        solve(arr,0,0);

    }
}