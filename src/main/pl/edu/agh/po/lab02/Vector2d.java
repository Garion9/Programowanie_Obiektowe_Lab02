package pl.edu.agh.po.lab02;

public class Vector2d {
    public int x;
    public int y;

    public Vector2d(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public boolean precedes(Vector2d other) {
        if (this.x >= other.x && this.y >= other.y)
            return true;
        else
            return false;
    }

    public boolean follows(Vector2d other) {
        if (this.x <= other.x && this.y <= other.y)
            return true;
        else
            return false;
    }

    public Vector2d upperRight(Vector2d other) {
        int maxx;
        int maxy;
        if (this.x >= other.x) {
            maxx = this.x;
        }
        else {
            maxx = other.x;
        }
        if (this.y >= other.y) {
            maxy = this.y;
        }
        else {
            maxy = other.y;
        }
        Vector2d result = new Vector2d(maxx, maxy);
        return result;
    }

    public Vector2d lowerLeft(Vector2d other) {
        int minx;
        int miny;
        if (this.x <= other.x) {
            minx = this.x;
        }
        else {
            minx = other.x;
        }
        if (this.y <= other.y) {
            miny = this.y;
        }
        else {
            miny = other.y;
        }
        Vector2d result = new Vector2d(minx, miny);
        return result;
    }

    public Vector2d add(Vector2d other) {
        Vector2d result = new Vector2d(this.x + other.x,this.y + other.y );
        return result;
    }

    public Vector2d subtract(Vector2d other) {
        Vector2d result = new Vector2d(this.x - other.x,this.y - other.y );
        return result;
    }

    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (!(other instanceof Vector2d))
            return false;
        Vector2d that = (Vector2d) other;
        if (this.x == that.x && this.y == that.y)
            return true;
        else
            return false;
    }

    public Vector2d opposite() {
        Vector2d result = new Vector2d((-1)*this.x, (-1)*this.y);
        return result;
    }
}
