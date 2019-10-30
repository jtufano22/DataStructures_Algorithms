package Unit3.day1;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        setLength(length);
        setLength(width);

    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be positive. Length=" + length);
        }
        this.length = length;

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            IllegalArgumentException e = new IllegalArgumentException("Width must be positive. Width=" + width);
            throw e;
        }
        this.width = width;
    }


}
