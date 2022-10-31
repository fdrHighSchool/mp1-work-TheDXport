public class mathClassPrac {
    
    public static void main(String [] args) {

        System.out.println( euclideanDistance(5.234434424234, 6.2131312412414, 2, 3) );
    }
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        double distance = 0.0;
        distance = Math.sqrt( ( (x2 - x1)*(x2 - x1) ) + ( (y2-y1)*(y2-y1)));
    return distance;
   }


    public static double taxicabDistance(double x1, double y1, double x2, double y2) {

    double distance = 0.0;
    distance = (Math.abs( (x2 - x1) )) + (Math.abs( (y2 - y1) ));
    return distance;
}

    public static double areaOfCircle(double radius) {

        double area = ( (Math.PI)*(radius*radius) );
        return area;
    }

    public static double areaOfCylinder(double radius, double height) {
        double area = (2.0*areaOfCircle(radius)) + (2.0*Math.PI*radius*height);
        return area;
    }

    public static double heronsFormula (double side1, double side2, double side3) {
        double s = (side1 + side2 + side3)/2.0;
        double area = Math.sqrt( (s*(s-side1))*(s-side2)*(s-side3) );
        return area;

    }
}
