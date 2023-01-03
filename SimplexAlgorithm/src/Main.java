public class Main {
	   public static void main(String[] args) {

	        double[] oFc = {100, 40, 120};
	        double[][] eqt = { {12, 20, 15}, {6, 8, 5}, {3, 2, 3} };
	        double[] cons = {60, 50, 20};

	        Modeler model = new Modeler(eqt, cons, oFc);

	        SimplexMethod simplex = new SimplexMethod(model.getTableaux(),
	        model.getnOC(),
	        model.getnOVar());
	        System.out.println("Solution: " + simplex.value());
	    }

}