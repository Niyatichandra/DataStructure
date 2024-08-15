import java.util.Scanner;
public class crossword {
    public static void solution(char[][] arr,String[] words,int vidx) {
        if (vidx == words.length) {
            print(arr);
            return;
        }
        String word = words[vidx];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == '_' || arr[i][j] == word.charAt(0)) {
                    if (placehori(arr, word, i, j)) {
                        boolean[] weplaced = placewordhori(arr, word, i, j);
                        solution(arr, words, vidx + 1);
                        unplacewordhori(arr, weplaced, i, j);

                    }
                    if (placevert(arr, word, i, j)) {
                        boolean[] weplaced = placewordvert(arr, word, i, j);
                        solution(arr, words, vidx + 1);
                        unplacewordvert(arr,weplaced , i, j);
                    }
                }
            }
        }
    }
    public static boolean placehori(char[][] arr,String word,int i,int j) {
        if (j - 1 >= 0 && arr[i][j] != '+') {
            return false;
        } else if (j + word.length() < arr[0].length && arr[i][j + word.length()] != '+') {
            return false;
        }
        for (int jj = 0; jj < word.length(); jj++) {
            if (j + jj >= arr[0].length) {
                if (arr[i][j + jj] == '_' || arr[i][j + jj] == word.charAt(jj)) {
                    continue;
                }
                    else
                    return false;
                }
            }
            return true;
        }

        public static boolean placevert(char[][] arr,String word,int i,int j)
        {
            if(i-1>=0 && arr[i][j]!='+')
            {
                return false;
            }
            else if((i+word.length()<arr[0].length) && (arr[i+word.length()][j]!='+'))
            {
                return false;
            }
            for(int ii=0;ii<word.length();ii++)
            {
                if(i+ii>=arr[0].length)
                {
                    if(arr[i+ii][j]=='_'||arr[i+ii][j]==word.charAt(ii)) {
                        continue;
                    }
                    else
                        return false;
                    }
                }
                return true;
            }

    public static boolean[] placewordhori(char[][] arr,String word,int i,int j)
    {
        boolean[] weplaced= new boolean[word.length()];
        for(int jj=0;j<word.length();jj++)
        {
            if(arr[i][j]=='_') {
                arr[i][j + jj] = word.charAt(jj);
                weplaced[jj] = true;

            }
        }
        return weplaced;
    }

    public static boolean[] placewordvert(char[][] arr,String word,int i,int j)
    {
        boolean[] weplaced= new boolean[word.length()];
        for(int ii=0;i<word.length();ii++)
        {
            if(arr[i][j]=='_') {
                arr[i+ii][j ] = word.charAt(ii);
                weplaced[ii] = true;

            }
        }
        return weplaced;
    }


    public static void unplacewordhori(char[][] arr,boolean[] weplaced,int i,int j)
    {
        for(int jj=0;j<arr.length;jj++)
        {
            if(weplaced[jj]==true)
            {
                arr[i][j+jj]='_';
            }
        }
    }
    public static void unplacewordvert(char[][] arr,boolean[] weplaced,int i,int j)
    {
        for(int ii=0;i<arr.length;ii++)
        {
            if(weplaced[ii]==true)
            {
                arr[i+ii][j]='_';
            }
        }
    }
    public static void print(char[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[][]arr=new char[10][10];
        for(int i=0;i<arr.length;i++){
            String str=sc.next();
        arr[i]=str.toCharArray();


    }
        int n=sc.nextInt();
        String[] words=new String[n];
        for(int i=0;i<n;i++)

        {
            words[i]=sc.next();
        }
        solution(arr,words,0);


}
}
