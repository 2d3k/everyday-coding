import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        sb.append("***");
        sb.append("* *");
        sb.append("***");

        for (int i = 1; i <= n / 3; i++) {
            System.out.print(sb);
            for (int j = 1; j <= n / 3; j++) {
                System.out.print(sb);
            }
            System.out.println();
        }
    }
}