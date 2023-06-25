package concurrency;

/**
 * Mutable Object are requires special code to be used properly in concurrent application.
 */
public class Color {
    private int red;
    private int green;
    private int blue;
    private String name;

    public Color(int r, int b, int g, String n) {
        this.red = r;
        this.blue = b;
        this.green = g;
        this.name = n;
    }

    public void set(int r, int b, int g, String n) {
        this.red = r;
        this.blue = b;
        this.green = g;
        this.name = n;
    }

    public int getRGB() {
        return ((this.red << 16) | (green << 8) | (blue));
    }

    public String getName() {
        return this.name;
    }
}
