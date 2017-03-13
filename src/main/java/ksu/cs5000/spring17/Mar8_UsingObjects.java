package ksu.cs5000.spring17;


public class Mar8_UsingObjects {

    public static class MyPoint {
        public int x, y;

        public MyPoint(int p_x, int p_y) {
            this.x=p_x;
            this.y=p_y;
        }

        public int getX() {
            return x;
        }

        public void setX(int p_x) {
            this.x = p_x;
        }

        public int getY() {
            return y;
        }

        public void setY(int p_y) {
            this.y=p_y;
        }
    }

    public static void main(String args[]) {
        MyPoint p= new MyPoint(3,5);

        MyPoint p2=new MyPoint(13,5);

        System.out.println( p.getX() );
        System.out.println( p2.getX() );

    }

}
