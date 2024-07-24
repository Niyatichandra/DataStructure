import java.util.Scanner;
import java.util.ArrayList;
public class maze {
    public static void main(String[] args) {

    }

    public static ArrayList<String> getmaze(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if (sc < dc) {
            hpaths = getmaze(sr, sc + 1, dr, dc);


        }
        if (sr < dr) {
            vpaths = getmaze(sr + 1, sc, dr, dc);

        }
        ArrayList<String> paths = new ArrayList<>();
        for (String hpath : hpaths) {
            paths.add("h" + hpath);
        }
        for (String vpath : vpaths) {
            paths.add("v" + vpath);
        }
        return paths;
    }

}


