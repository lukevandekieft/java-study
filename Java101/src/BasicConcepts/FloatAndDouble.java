package BasicConcepts;

public class FloatAndDouble {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        System.out.println("Int Value 5 = " + 5);
        System.out.println("Float Value 5 = " + 5f);
        System.out.println("Double Value 5 = " + 5d);

        System.out.println("Int Value 5/2 = " + 5 / 2); // Int completely ignores remainder
        System.out.println("Float Value 5/2 = " + 5f / 2f);
        System.out.println("Double Value 5/2 = " + 5d / 2d);

        System.out.println("Int Value 5/3 = " + 5 / 3);
        System.out.println("Float Value 5/3 = " + 5f / 3f);
        System.out.println("Double Value 5/3 = " + 5d / 3d);
    }
}
