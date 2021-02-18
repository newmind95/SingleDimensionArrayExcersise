package ex0725;

/**
 *
 * @author kristiyan
 */
public class EX0725 {
    /** Main method. */
    public static void main(String[] args) {
        double[] roots = new double[3];
        double[] eqn = new double[3];
        solveQuadratic(eqn, roots);
    }
    
    public static int solveQuadratic(double[] eqn, double[] roots) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter root a: ");
        int a = input.nextInt();
        a = (int)eqn[0];
        System.out.print("Enter root b: ");
        int b = input.nextInt();
        b = (int)eqn[1];
        System.out.print("Enter root c: ");
        int c = input.nextInt();
        c = (int)eqn[2];
        
        int result = b * b - 4 * a * c;
        
        if (result > 0) 
            roots[1] = (-b + Math.pow(result, 0.5) / (-2 * a));
            roots[2] = (-b - Math.pow(result, 0.5) / (-2 * a));
            System.out.println("The root of " + roots[1] + " and " + roots[2] + " is " + result);
        
        return result;
    }
}
