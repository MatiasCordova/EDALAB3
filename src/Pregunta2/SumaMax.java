package Pregunta2;

import java.util.LinkedList;
import java.util.Queue;

class BST {

    static int SumaNiveles(Nodo root) {
        if (root == null) {
            return 0;
        }
        int result = root.data;

        Queue<Nodo> lista = new LinkedList<>();

        lista.add(root);
        while (!lista.isEmpty()) {

            int contador = lista.size();

            int sum = 0;
            while (contador-- > 0) {

                Nodo temp = lista.poll();

                sum = sum + temp.data;

                if (temp.left != null) {
                    lista.add(temp.left);
                }
                if (temp.right != null) {
                    lista.add(temp.right);
                }
            }

            result = Math.max(sum, result);
        }
        return result;
    }

    static class Nodo {

        int data;
        Nodo left, right;

        public Nodo(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {

        //creacion de Arbol
        Nodo root = new Nodo(13);
        root.left = new Nodo(22);
        root.right = new Nodo(35);
        root.left.left = new Nodo(42);
        root.left.right = new Nodo(51);
        root.right.right = new Nodo(28);
        root.right.right.left = new Nodo(26);
        root.right.right.right = new Nodo(17);
        root.left.right.right = new Nodo(5);
        root.right.right.left = new Nodo(98);
        root.right.right.left.right = new Nodo(26);
        root.right.right.right.left = new Nodo(7);

        System.out.println(SumaNiveles(root));
    }
}
