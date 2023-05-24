public class WeightedQU {
    private int[] id;
    private int[] size;

    public WeightedQU(int N){
        id = new int[N];
        size = new int[N];

        for (int i=0; i<N; i++){
            id[i] = i;
            size[i] = 1;
        }
    }
    public int find(int i){
        while (i != id[i]){
            i=id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return find(p)==find(q);
    }

    public void union(int p, int q){
        int pRoot = find(p);
        int qRoot = find(q);

        if (pRoot==qRoot){
            return;
        }
        if (size[pRoot] < size[qRoot]){
            id[pRoot] = qRoot;
            size[qRoot] += size[pRoot];
        }
        else {
            id[qRoot] = pRoot;
            size[pRoot] += size[qRoot];
        }
    }
}
