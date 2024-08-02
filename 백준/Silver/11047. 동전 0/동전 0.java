import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer setting = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(setting.nextToken());
        int k = Integer.parseInt(setting.nextToken());
        int[] coin = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        for (int i = n - 1; i >= 0; i--) {
            if (k >= coin[i]) {
                count += k / coin[i];
                k %= coin[i];
            }
        }
        System.out.println(count);
    }
}
