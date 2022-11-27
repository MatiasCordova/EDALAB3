package Pregunta1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class BFS {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, m;
        String artist;
        artist = sc.next();
        n = sc.nextInt();
        m = sc.nextInt();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] line = in.readLine().split(":");
        String[] artists = line[0].split(",");
        String song = line[1];
        HashMap<String, Integer> artistMap = new HashMap<String, Integer>();
        int i = 0;

        for (int k = 0; k < artists.length; k++) {
            //System.out.println(artists[k]);
            //System.out.println(song);
            if (!artistMap.containsKey(artists[k])) {
                artistMap.put(artists[k], i);
                i++;
            }
        }
        System.out.println(artistMap);
        in.close();
    }
}
