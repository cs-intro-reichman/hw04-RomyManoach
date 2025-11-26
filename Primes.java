public class Primes {
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n + 1];
        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i <= n; i++) {
            arr[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (arr[i] == true){
                for (int j = i * i; j <= n; j = j + i){
                arr[j] = false;
                }
            }
        }
          System.out.println("Prime numbers up to " + n + ":");
            int count = 0;
            for (int i = 2; i <= n; i++) {
                if (arr[i]) {
                    System.out.println(i);
                    count++;
                }
            }
            System.out.println("There are " + count + " primes between 2 and " + n + 
                           " (" + (int)(100.0 * count / n) + "% are primes)");
    }
}