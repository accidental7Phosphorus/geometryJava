//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*
    public Segment perpendicular(Segment s, Point p){
        float a1 = (s.getP2().y-s.getP1().y)/(s.getP2().x-s.getP1().x);
        float a2 = -1/a1;
        float b2 = p.y - a2*p.x;
    }
     */
    public static void main(String[] args) {
        Point p1 = new Point(3, 0);
        Point p2 = new Point(0, 4);
        Segment segment =new Segment(p1, p2);
        System.out.println(segment.distance());
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}