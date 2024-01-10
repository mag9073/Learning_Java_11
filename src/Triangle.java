
public class Triangle {
    // this is part of chapter 6: classes in java

    // attribute/property
    // static variable
    static int numOfSides = 3; // the number of sides will always be 3; it is static

    // non-static variables:
    double base; // attribute variable for base
    double height; // attribute variable for height
    double sideLenOne; // attribute variable for side length one
    double sideLenTwo; // attribute variable for side length two
    double sideLenThree; // attribute variable for side length three

    // constuctor; allows us to create instances; assume numbers given are valid
    public Triangle (double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree) {
        // are non-static instance variables because the value changes for every triangle and depends
        // on the instance variable
        this.base = base; // use inputs to assign values to attributes
        this.height = height; // this separates the attribute (Lt side) and parameters/argument (Rt side)
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }
    //
    // method = behaviour or function belonging to a class
    public double findArea() {
        return (this.base * this.height) / 2; // access instance variables base and height using the this keyword
    }
}
