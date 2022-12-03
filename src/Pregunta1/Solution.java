package Pregunta1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, m;
        String artist;
        artist = sc.next();
        n = sc.nextInt();
        m = sc.nextInt();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String linea;
        String[] line = null;
        String[] artists = null;
        String song = null;
        Map<String, List<String>> artistMap = new HashMap<String, List<String>>();

        while ((linea = in.readLine()) != null) {
            line = linea.split(":");
            artists = line[0].split(",");
            song = line[1];
            List<String> art = new ArrayList<String>();
            for (int k = 0; k < artists.length; k++) {
                art.add(artists[k]);
                artistMap.put(song, art);
            }
        }

        System.out.println(artistMap);
        in.close();

    }
}
