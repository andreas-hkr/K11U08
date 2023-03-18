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

    static double sigma(double[] arr) {
        double a = kvadSum(arr);
        double b = (sum(arr)*sum(arr)) / arr.length;

        return Math.sqrt((a-b)/(arr.length-1));
    }

    public static void main(String[] args) {
        // Skriv en metod sigma som beräknar standardavvikelsen
        // Formel finns i beskrivningen, tipset är att använda
        // våra metoder sum och kvadSum som vi skapade tidigare

        double[] arr = {1, 2, 3, 4, 5};
        double res = sigma(arr);
        System.out.println("Resultat: " + res);
    }
}