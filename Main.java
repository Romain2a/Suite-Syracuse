import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.io.*;

//import static java.lang.System.*;

public class Main {
    public static void main(String args[]) {
        String z = args[0];
        int x = Integer.parseInt(z);

        int n = 5;

        // System.out.println(somme_carre_recursive(n));
        // String mot = "bacde";
        // if (palindrome(mot, 0))
        //     System.out.println("Palindrome");
        // else
        //     System.out.println(" Pas palindrome");
        // int t[] = {1, 3, 6, 7, 0};
        // System.out.println(" Before");
        // System.out.println(Arrays.toString(t));
        // System.out.println(" After");
        // invert(t, 0);
        // System.out.println(Arrays.toString(t));
        // System.out.println(fibonacci());
        System.out.println("suite de syracuse : ");


        try {
            FileWriter fw = new FileWriter("f"+x+".txt"); // on créé un objet qui est un fichier txt
            BufferedWriter bw = new BufferedWriter(fw); // on crée un autre objet qui est un buffer dans lequel on va stocker les infos
            bw.write("n Un");
            bw.newLine();
            syracuse(x, 0, 0, bw);
            bw.close();
            System.out.println("Ecriture terminée");
        } catch (Exception e) {
            System.out.println("Erreur " + e);
        }
    }
    // Question 1 Ecrire une fonction récursive qui calcule la somme des n premiers carrés. Par
    // exemple, si n vaut 3, ce sous-programme calculera 12 + 22 + 32. Ce sous programme n’est défini
    // que pour un n supérieur à 0.
    public static int somme_carre_recursive(int n) {
        if (n == 1)
            return 1;
        else
            return (n * n + somme_carre_recursive(n - 1));
    }

    // Question 3 Ecrire un sous-programme récursif qui vérifie si une chaîne de caractère est un
    // palindrôme. Rappel : un palindrôme est un mot qui se lit de la même façon de gauche à droite
    // et de droite à gauche, comme par exemple ada ou radar. Pour cela vous utiliserez les méthodes
    // charAt et length de la classe String. s.charAt(i) renvoie le ième caractère de la chaîne s et
    // s.length() renvoie la longueur de s.

    static boolean palindrome(String s, int pos) {
        if (pos > s.length() / 2)
            return true;

        else if (s.charAt(pos) == s.charAt(s.length() - pos - 1))
            return palindrome(s, pos + 1);
        else
            return false;

    }
    // Question 4 Ecrire un sous-programme récursif qui réarrange les éléments d’un tableau en
    // ordre inverse.

    static void invert(int t[], int i) {
        if (i < t.length / 2) {
            // permutation

            int aux = t[i];
            t[i] = t[t.length - i - 1];
            t[t.length - i - 1] = aux;
            // case suivante
            invert(t, i + 1);
        }
    }

    //Question 5 Ecrire une fonction qui calcule les valeurs de la série de Fibonacci, définie par :
    //    — u0 = 0
    //    — u1 = 1
    //    — un = un−1 + un−2
    // Ecrivez cette fonction sous forme itérative et sous forme récursive.

    public static int fibonacci() {
        int u0 = 0;
        int u1 = 1;
        int un = 0;
        int i;
        int count = 10;

        for (i = 2; i < count; i++) {
            un = u0 + u1;
            u0 = u1;
            u1 = un;
            System.out.println(un);
        }
        return un;
    }

    public static int recursivite_fibo(int nb) {
        if (nb < 2) {
            return nb;
        } else return recursivite_fibo(nb - 1) + recursivite_fibo(nb - 2);

    }

    // Question 6 Mini projet : Conjecture de Syracuse
    // f(x) = x/2 si pair et 3x+1 si impair
    // 1. Écrire une fonction Collatz calculant la valeur de la fonction f(x) sur son argument x.

    static int collatz(int x) {
        if (x % 2 == 0)
            return x / 2;
        else
            return 3 * x + 1;
    }

    static void syracuse(int x, int cpt, int max, BufferedWriter bw) throws IOException { // throws permet de traiter les exceptions s'il y a des erreurs dans le try ...catch
        if ( x > max)
            max = x;
        if (x == 1)
        {
            bw.write(cpt+" "+x);
            bw.newLine();
            bw.write("durée de vol=" + cpt);
            bw.newLine();
            bw.write("la valeur max est de=" + max);
            bw.newLine();
            return;
        }
        else {
            bw.write(cpt +" "+x);
            bw.newLine();
            syracuse(collatz(x), cpt + 1, max, bw);
        }
    }

}