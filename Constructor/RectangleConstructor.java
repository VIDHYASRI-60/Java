/*class RectangleConstructor {
    int length;
    int breadth;

    RectangleConstructor() {
        length = 1;
        breadth = 1;
        System.out.println("Rectangle: " + length + " x " + breadth);
    }

    RectangleConstructor(int side) {
        length = side;
        breadth = side;
        System.out.println("Square: " + length + " x " + breadth);
    }

    RectangleConstructor(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Rectangle: " + length + " x " + breadth);
    }

}*/



class RectangleConstructor {
    int length;
    int breadth;

    RectangleConstructor() {
        length = 1;
        breadth = 1;
        System.out.println("Area: " + (length * breadth));
    }

    RectangleConstructor(int side) {
        length = side;
        breadth = side;
        System.out.println("Area: " + (length * breadth));
    }

    RectangleConstructor(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Area: " + (length * breadth));
    }

}
