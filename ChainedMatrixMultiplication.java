public class ChainedMatrixMultiplication {
    static int n = 7;
    //static int[] d = { 5, 2, 3, 4, 6, 7, 8 };
    static int[] d = { 3, 6, 2, 8, 7, 5, 3, 2};
    static int[][] p = new int[n][n];

    public static void order(int i, int j) {
        int k;
        if (i == j) {
            System.out.print("A" + (i+1));
        } else {
            k = p[i][j];
            System.out.print("(");
            order(i, k);
            order(k + 1, j);
            System.out.print(")");
        }
    }

    public int minmult(int n, int d[], int p[][]) {
        int i, j, k, diagonal;
        int M[][] = new int[n][n];
        int small = 9999, temp = -1;

        for (i = 0; i < n; i++) {
            M[i][i] = 0;
        }

        for (diagonal = 1; diagonal <= n - 1; diagonal++) {
            for (i = 0; i < n - diagonal; i++) {
                j = i + diagonal;
                small = 9999;
                for (k = i; k <= j - 1; k++) {
                    temp = M[i][k] + M[k + 1][j] + d[i] * d[k + 1] * d[j + 1];
                    System.out.println("diago: "+diagonal+", i: "+i+", j: "+j+", k: "+k+", d["+i+"]: "+d[i]+", d["+(k+1)+"]:"+d[k+1]+", d["+(j+1)+"]: "+ d[j+1]+", temp: "+ temp);
                    if (small > temp) {
                        small = temp;
                        M[i][j] = temp;
                        p[i][j] = k;
                    }
                }
            }
            System.out.println();
        }

        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                System.out.print(M[i][j]+"\t");
            }
            System.out.println();
        }

        return M[0][n - 1];
    }

    public static void main(String[] args) {
        ChainedMatrixMultiplication cmm = new ChainedMatrixMultiplication();

        System.out.println("answer: " + cmm.minmult(n, d, p));
        

        order(0, n-1);
    }
}
