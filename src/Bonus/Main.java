
package Bonus;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int Torres(ArrayList<Integer> array) {
        ArrayList<Integer> aux = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            int a = array.get(i);
            int l = 0;
            int h = aux.size();

            while (l < h) {
                int mid = (l + h) / 2;

                if (aux.get(mid) > a) {
                    h = mid;
                } else {
                    l = mid + 1;
                }
            }
            if (l == aux.size()) {
                aux.add(a);
            } else {
                aux.set(l, a);
            }
        }

        return aux.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b;
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            b = sc.nextInt();
            a.add(b);
        }
        System.out.println(Torres(a));
    }

}

