package Stack;

public class TowerOfHanoi {

    static void towerOfHanoi(int n, int from, int to, int aux)
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        towerOfHanoi(n-1, from, aux, to);
        System.out.println("Move disk " + n + " from " +  from + " to " + to);
        towerOfHanoi(n-1, aux, to, from);
    }

    public static void main(String[] args) {
        TowerOfHanoi t=new TowerOfHanoi();
        int n = 3;
        t.towerOfHanoi(n,1,2,3);
    }
}
