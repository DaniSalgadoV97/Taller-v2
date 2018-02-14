package TallerV2;

public class Taller {

    protected double x;
    private double y;
    private double r;

    void sumar() {
        r = x + y;
    }

    void restar() {
        r = x - y;
    }

    public void setx(float x) {
        this.x = x;
    }

    public void sety(float y) {
        this.y = y;
    }

    public float getr(float r) {
        return r;
    }
}
