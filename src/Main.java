import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] monTableau = new int[10];

        for(int i = 0 ; i < 10 ; i++){
            monTableau[i] = (i+1) * 2;
        }

        System.out.println(Arrays.toString(monTableau));
    }
}