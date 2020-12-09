//0-1 knapsack problem
//W가 23 이상 즉, 모든 것들을 다 담을 수 있을 때에 마지막 것을 담지 못하는 문제
//
//public class Kanpsack {
    static public int numbest ;
    static public int maxprofit;
    static public String[] bestset;
    static public String[] include;
    // static public int n = 4;
    // static public int W = 10;
    // static public int[] w = {0, 10, 15, 3, 20};
    // static public int[] p = {0, 100, 105, 15, 60};
    static public int n = 4;
    static public int W = 23;
    static public int[] w = {0, 2, 5, 10, 5};
    static public int[] p = {0, 40, 30, 50, 10};
    public static int profit, weight;
    public static int cnt;

    void knapsack(int i, int profit, int weight){
        System.out.printf("ks(i: %d, cnt: %d)\n", i , cnt);
        if(weight <= W && profit > maxprofit){
            maxprofit = profit;
            numbest = i;
            bestset = include.clone();
        }
        if(promising(i)){
            System.out.println("yes i: "+ i);

            include[i+1] = "yes";
            knapsack(i+1, profit+p[i+1], weight+ w[i+1]);
            include[i+1] = "no";
            System.out.println("no i: "+ i);
            knapsack(i+1, profit, weight);
        }
        System.out.printf("ks(i: %d, cnt: %d) finish\n", i , cnt);
    }

    public static boolean promising(int i){
        System.out.println("promising(i: "+i +", cnt: "+ cnt+")");
        int j, k;
        int totweight;
        float bound;

        if(weight >= W){
            System.out.println("promising finsish(i: "+i +", cnt: "+ cnt+"), return false");
            return false;
        }
        else{
            j = i;
            bound = profit;
            totweight = weight;
            while((j <= n) && (totweight + w[j] <= W)){
                totweight = totweight + w[j];
                bound = bound + p[j];
                System.out.printf("i: %d, j: %d, totWeight: %d, bound: %f\n", i, j, totweight, bound);
                j++;
            }
            k = j;
            if(k <= n)
                bound = bound + (W-totweight) * p[k] / w[k];

            System.out.println("promising finsish(i: "+i +", cnt: "+ cnt+")");
            return bound > maxprofit;
        }
    }

    public static void main(String[] args) {
        int i = 1;
        bestset = new String[n];
        include = new String[n];

        Kanpsack ks = new Kanpsack();
        ks.knapsack(0, 0, 0);
        System.out.println("maxprofit: "+maxprofit);

        System.out.println("<<bestset 내용 출력>>");
        for(String str : bestset)
            // if(str != null)
            System.out.println("item("+(i++)+"): "+ str);
    }
}

