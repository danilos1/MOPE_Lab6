import java.util.Arrays;

public class ModuleWithSq {
    static int getAvg(int[] a) {
        return (int)Math.round(Arrays.stream(a).average().getAsDouble());
    }

    public static void main(String[] args) {
        int[] xMinMax = {-10, 1, -9, 7, -8, 3};
        double[] fCoef = {2.1, 1.1, 0.5, 4.2, 8.6, 1.0, 2.8, 1.0, 0.5, 0.9, 2.4};

        System.out.println("x1min = " + xMinMax[0] + ", x1max = " + xMinMax[1] + ", x2min = " + xMinMax[2] +
                ", x2max = " + xMinMax[3] + ", x3min = " + xMinMax[4] + ", x3max = " + xMinMax[5]);

        System.out.printf("f(x1, x2, x3) = %.2f + %.2f*x1 + %.2f*x2 + %.2f*x3 + %.2f*x1*x1 + %.2f*x2*x2 + %.2f*x3*x3 " +
                "+ %.2f*x1*x2 + %.2f*x1*x3 + %.2f*x2*x3 + %.2f*x1*x2*x3\n",fCoef[0], fCoef[1], fCoef[2], fCoef[3], fCoef[4],
                fCoef[5], fCoef[6], fCoef[7], fCoef[8], fCoef[9], fCoef[10]);


        ThreeFactorsExperimentWithSq exp = new ThreeFactorsExperimentWithSq(xMinMax, fCoef);
        exp.printMatrixOfPlanning();
        exp.findEquationOfRegression();
        exp.testByCriterionKohrena();
        exp.testByStudentCriterion();
        exp.testByFisheraCriterion();
    }
}
