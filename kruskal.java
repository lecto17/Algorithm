//2020년 하반기
//
//
//import java.util.*;

class Universal{
    int parent;
    int depth;
}

class Obj implements Comparable<Object>{
    String key;
    int value;

    public Obj(String key, int value){
        this.key = key;
        this.value = value;
    }
	@Override
	public int compareTo(Object o) {
        // TODO Auto-generated method stub
        Obj obj = (Obj) o;
		return (this.value < obj.value ? -1 : (this.value == obj.value ? 0 : 1));
	}
}

public class Kruskal {
    public static int n = 6;
    public static Universal[] U = new Universal[n];

    public void initial(int n){
        int i;
        for(i =0; i< n; i++){
            makeset(i);
        }
    }

    public void makeset(int i){
        U[i] = new Universal();
        U[i].parent = i;
        U[i].depth = 0;
    }

    public boolean equal(int p, int q){
        if(p == q)
            return true;
        else
            return false;
    }

    public int find(int i){
        int j;
        j = i;
        while(U[j].parent != j){
            j = U[j].parent;
        }
        return j;
    }

    public void merge(int p, int q){
        if(U[p].depth == U[q].depth){
            U[p].depth += 1;
            U[q].parent = p;
        }
        else if(U[p].depth < U[q].depth)
            U[p].parent = q;
        else
            U[q].parent = p;
    }

    public void kruskal(int n, int m, List<Obj> E, List<String> F){
        int i,j,p,q, cnt=0;
        String e = "";
        Collections.sort(E);

        initial(n);
        while(cnt < n){
            e = E.get(cnt).key;
            i = Integer.parseInt(e.split(" ")[0]);
            j = Integer.parseInt(e.split(" ")[1]);
            p = find(i);
            q = find(j);
            if(!equal(p, q)){
                merge(p,q);
                F.add(e);
            }
            cnt++;
        }
    }
    public static void main(String[] args) {


        List<String> f = new ArrayList<>();
        Kruskal kruskal = new Kruskal();
        List<Obj> e = new ArrayList<>();
        e.add(new Obj("0 3",4));
        e.add(new Obj("0 4",5));
        e.add(new Obj("1 2",2));
        e.add(new Obj("1 4",7));
        e.add(new Obj("1 5",1));
        e.add(new Obj("2 3",3));
        e.add(new Obj("2 4",4));
        e.add(new Obj("4 5",6));
        int m = e.size();
        kruskal.kruskal(n, m, e, f);

        // e.add(new Obj("0 1", 1));
        // e.add(new Obj("0 2", 3));
        // e.add(new Obj("1 2", 3));
        // e.add(new Obj("1 3", 6));
        // e.add(new Obj("2 3", 4));
        // e.add(new Obj("2 4", 2));
        // e.add(new Obj("3 4", 5));


        for(String str : f)
            System.out.println(str);
    }
}

