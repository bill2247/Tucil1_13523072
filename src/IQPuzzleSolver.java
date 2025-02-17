import java.io.*;
import java.util.*;

public class IQPuzzleSolver{
    private static int M, N, P;
    // private static char[][] board;
    private static List<char[][]> pieces;

    private static void readInput(String fileName) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String[] dimensions = br.readLine().split(" ");
        N = Integer.parseInt(dimensions[0]);
        M = Integer.parseInt(dimensions[1]);
        P = Integer.parseInt(dimensions[2]);

        pieces = new ArrayList<>();
        char presentChar = '0';
        String shape = "";
        String tempShape = "";
        int i = 0;
        boolean stop = false;
        while (!stop) {
            tempShape = br.readLine();
            if (tempShape == null || tempShape.isEmpty()) {
                stop = true;
                continue; // Lewati baris kosong
            }
            if (presentChar == shape.charAt(0)) {
                shape += tempShape;
            } else {
                i ++;
                pieces.add(convertToMatrix(shape));
                if (i == P){
                    stop = true;
                } else {
                    presentChar = tempShape.charAt(0);
                    shape = tempShape;
                }
            }
        }
        br.close();
    }

    private static char[][] convertToMatrix(String shape) {
        // pada String shape, baris dipisahkan dengan spasi dan kolom dipisahkan dengan "\n", jumlah kolom dan baris bersifat dinamis
        String[] rows = shape.split("\n");
        int rowsLength = rows.length;
        int[] colsLength = new int[rowsLength];
        for (int i = 0; i < rowsLength; i++) {
            colsLength[i] = rows[i].split(" ").length;
        }
        int maxColsLength = Arrays.stream(colsLength).max().getAsInt();
        char[][] matrix = new char[rowsLength][maxColsLength];
        // inisiasi matrix dengan karakter kosong
        for (int i = 0; i < rowsLength; i++) {
            for (int j = 0; j < maxColsLength; j++) {
                matrix[i][j] = '0';
            }
        }
        for (int i = 0; i < rowsLength; i++) {
            String[] cols = rows[i].split(" ");
            for (int j = 0; j < cols.length; j++) {
                matrix[i][j] = cols[j].charAt(0);
            }
        }
        return matrix;
    }
    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama file: ");
        String fileName = sc.nextLine();
        fileName = "test/" + fileName + ".txt";
        readInput(fileName);
        System.out.println("M = " + M);
        System.out.println("N = " + N);
        System.out.println("P = " + P);
        for (int i = 0; i < P; i++) {
            System.out.println("Piece " + (i + 1));
            printMatrix(pieces.get(i));
        }
        sc.close();
    }
}