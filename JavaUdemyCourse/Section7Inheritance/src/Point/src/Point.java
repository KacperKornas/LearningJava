public class Point {

    private int x;
    private int y;


    public Point () {
    }

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(Point another) {
        int deltaX = this.x - another.getX();
        int deltaY = this.y - another.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double distance() {
        return distance(0,0);
    }
}
