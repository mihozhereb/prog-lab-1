public class Main {
    static int[] filter = {5, 6, 8, 12, 14, 15};
    static short[] z = new short[13];
    static float[] x = new float[19];
    static double[][] z1 = new double[13][19];

    public static boolean findNumberInFilter(int number) {
        for (int j : Main.filter) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }

    public static void matrixPrint(double[][] matrix) {
        for (double[] i : matrix) {
            for (double j : i) {
                System.out.printf("%.5f ", j);
            }
            System.out.println();
        }
    }

    public static void getMatrixElement(int i, int j) {
        if (z[i] == 10) {
            z1[i][j] = Math.exp(Math.cbrt(Math.pow((1 - x[j]) / 0.25, x[j])));
        } else if (findNumberInFilter(z[i])) {
            z1[i][j] = Math.cos(Math.asin(x[j] / 3 * Math.E + 1));
        } else {
            z1[i][j] = Math.pow(Math.log(Math.pow(Math.sin(Math.asin(Math.pow(x[j] / 3 * Math.E + 1, 2))), 2)) *
                    (0.25 + (0.5 - Math.log(Math.abs(x[j]))/ 3)), 3);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 13; i++) {
            z[i] = (short) (i + 3);
        }

        for (int i = 0; i < x.length; i++) {
            x[i] = (float) (-15 + Math.random() * (30));
        }

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 19; j++) {
                getMatrixElement(i, j);
            }
        }

        matrixPrint(z1);
    }
}