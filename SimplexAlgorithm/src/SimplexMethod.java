public class SimplexMethod {
    int p1, p2;
    private double[][] tableaux;
    private int noC;
    private int noV;

    private boolean maximizeOrMinimize;

    private static final boolean MAXIMIZE = true;

    private int[] basis;

    public SimplexMethod(double[][] tableaux, int numberOfConstraint,
        int numberOfOriginalVariable) {
        this.maximizeOrMinimize = MAXIMIZE;
        this.noC = numberOfConstraint;
        this.noV = numberOfOriginalVariable;
        this.tableaux = tableaux;

        basis = new int[noC];
        for (int i = 0; i < noC; i++)
            basis[i] = noV + i;

        solve();

    }
    private void solve() {
        while (true) {

            show();
            int q = 0;
            if (maximizeOrMinimize) {
                q = dantzig();
            } else {
                q = dantzigNegative();
            }
            if (q == -1)
                break;

            int p = minRatioRule(q);
            
            if (p == -1)
                throw new ArithmeticException("Linear program is unbounded");
            
            p1 = p;
            p2 = q;
            pivot(p, q);
            basis[p] = q;

        }
    }

    private int dantzig() {
        int q = 0;
        for (int j = 1; j < noC + noV; j++)
            if (tableaux[noC][j] > tableaux[noC][q])
                q = j;

        if (tableaux[noC][q] <= 0)
            return -1;
        else
            return q;
    }

    private int dantzigNegative() {
        int q = 0;
        for (int j = 1; j < noC + noV; j++)
            if (tableaux[noC][j] < tableaux[noC][q])
                q = j;

        if (tableaux[noC][q] >= 0)
            return -1;
        else
            return q;
    }

    private int minRatioRule(int q) {
        int p = -1;
        for (int i = 0; i < noC; i++) {
            if (tableaux[i][q] <= 0)
                continue;
            else if (p == -1)
                p = i;
            else if ((tableaux[i][noC +
                    noV
                ] / tableaux[i][q]) < (tableaux[p][noC +
                    noV
                ] / tableaux[p][q]))
                p = i;
        }
        return p;
    }
    private void pivot(int p, int q) {

        for (int i = 0; i <= noC; i++)
            for (int j = 0; j <= noC +
                noV; j++)
                if (i != p && j != q)
                    tableaux[i][j] -= tableaux[p][j] * tableaux[i][q] /
                    tableaux[p][q];
        for (int i = 0; i <= noC; i++)
            if (i != p)
                tableaux[i][q] = 0.0;
        for (int j = 0; j <= noC + noV; j++)
            if (j != q)
                tableaux[p][j] /= tableaux[p][q];
        tableaux[p][q] = 1.0;
    }
    public double value() {
        return -tableaux[noC][noC +
            noV
        ];
    }

    public void show() {
        System.out.println("The Tableau is:");

        for (int i = 0; i <= noC; i++) {
            for (int j = 0; j <= noC + noV; j++) {
                System.out.printf("%7.2f ", tableaux[i][j]);
            }
            System.out.println();
        }
        System.out.println("Pivot: " + p1 + " " + p2);
        System.out.println("value = " + value());
        System.out.println();
    }


 

}