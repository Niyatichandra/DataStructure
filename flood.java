import java.util.Scanner;
public class flood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        fill(arr, 0, 0, "", visited);

    }

    public static void fill(int[][] maze, int r, int c, String psf, boolean[][] visited) {
        if (r < 0 || c < 0 || r == maze.length || c == maze[0].length || maze[r][c] == 1 || visited[r][c] == true) {
            return;
        }
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(psf);
            return;
        }
        visited[r][c] = true;
        fill(maze, r - 1, c, psf + "t", visited);
        fill(maze, r, c - 1, psf + "l", visited);
        fill(maze, r + 1, c, psf + "d", visited);
        fill(maze, r, c + 1, psf + "r", visited);
        visited[r][c] = false;

    }
}

