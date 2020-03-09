import java.util.Arrays;

public class DiagonalMatrix {
    public static void main(String[] args) {
        byte[][] matrix = new byte[4][4];
        byte j = 0;
        for (int i = 0; i < 4; i++) {
            matrix[i][j] = 1;
            j++;
        }
        for (byte[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
