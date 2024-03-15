public class Segment {
    private Point p1, p2;

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Segment(Point p1, Point p2){
        this.p1 = new Point(p1.x, p1.y);
        this.p2 = new Point(p2.x, p2.y);
    }

    public double distance(){
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    public String toSvg(){
        return "<line x1=\\" + p1.x + "\\ y1=\\" + p1.y + "\\ x2=\\" + p2.x + "\\ y2=\\" + p2.y + "\\style=stroke:green;stroke-width:6 />";
    }
}
