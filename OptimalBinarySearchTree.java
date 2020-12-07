class MinAvg{
    double minavg;
}

public class OptimalBinarySearchTree{
    void optSearchTree(int n, double[] P, MinAvg min, int[][] index){
        int i,j, k, diagonal;        
        double temp = 0.0, per= 0.0, small = 9999;
        double[][] A = new double[n+2][n+1];                
        
        for(i = 1; i <= n; i++){
            A[i][i-1] = 0;
            A[i][i] = P[i-1];
            index[i][i] = i;
            index[i][i-1] = 0;
        }        

        A[n+1][n] = 0;
        index[n+1][n] = 0;        

        for(diagonal = 1; diagonal <= n-1; diagonal++){
            for(i = 1; i <= n -diagonal; i++){
                j = i+diagonal;
                small = 9999;   
                per = 0.0;       
                for(k=i; k <= j; k++)             
                    per += P[k-1];

                for(k = i; k <= j; k++){
                    temp = A[i][k-1] + A[k+1][j]+per;
                    System.out.println("diago: "+diagonal+", i: "+i+", j: "+j+", k: "+k+", A["+i+"]["+(k-1)+"]: "+A[i][k-1]+", A["+(k+1)+"]["+j+"]:"+A[k+1][j]+", P["+(k-1)+"]: "+ P[k-1]+", temp: "+ temp);
                    if (small > temp) {                        
                        small = temp;
                        A[i][j] = temp;
                        index[i][j] = k;
                    }
                }            
            }
            System.out.println();
        }

        for(i = 1; i < n+2; i++){
            for(j=0; j < n+1; j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        
        System.out.println();

        for(i = 1; i < n+2; i++){
            for(j=0; j < n+1; j++){
                System.out.print(index[i][j]+"\t");
            }
            System.out.println();
        }
        
        min.minavg = A[1][n];
    }

    public static void main(String[] args) {
        OptimalBinarySearchTree obst = new OptimalBinarySearchTree();
        MinAvg min = new MinAvg();
        double[] P = { (double)1/8, (double)2/8, 
            (double)3/8, (double)3/8, (double)7/8};            
        int n = 5;
        int[][] index = new int[n+2][n+1];

        obst.optSearchTree(n, P, min, index);        

    }
}