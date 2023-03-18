public class Main {
    static double sum(double[] arr) {
        double total = 0;

        for(int i=0; i < arr.length; i++) {
            total += arr[i];
        }

        return total;
    }

    static double kvadSum(double[] arr) {
        double total = 0;

        for(int i=0; i < arr.length; i++) {
            total += arr[i] * arr[i];
        }

        return total;
    }

    public static void main(String[] args) {
        // Skriv en metod sigma som beräknar standardavvikelsen
        // Formel finns i beskrivningen, tipset är att använda
        // våra metoder sum och kvadSum som vi skapade tidigare


    }
}