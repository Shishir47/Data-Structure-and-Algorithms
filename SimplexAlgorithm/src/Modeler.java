   public class Modeler {
        private double[][] a;
        private int nOCs;
        private int nOVar;

        public Modeler(double[][] constraintLeftSide,
            double[] constraintRightSide,
            double[] objectiveFunction) {
            nOCs = constraintRightSide.length;
            nOVar = objectiveFunction.length;
            a = new double[nOCs + 1][nOVar + nOCs + 1];
            for (int i = 0; i < nOCs; i++) {
                for (int j = 0; j < nOVar; j++) {
                    a[i][j] = constraintLeftSide[i][j];
                }
            }
            for (int i = 0; i < nOCs; i++)
                a[i][nOCs + nOVar] = constraintRightSide[i];

            for (int i = 0; i < nOCs; i++) {
                int slack = 1;
                a[i][nOVar + i] = slack;
            }
            for (int j = 0; j < nOVar; j++)
                a[nOCs][j] = objectiveFunction[j];
        }

        public double[][] getTableaux() {
            return a;
        }

        public int getnOC() {
            return nOCs;
        }

        public int getnOVar() {
            return nOVar;
        }
    }

 