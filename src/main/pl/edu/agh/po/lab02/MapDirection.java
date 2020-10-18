package pl.edu.agh.po.lab02;

public enum MapDirection {
    NORTH,
    SOUTH,
    WEST,
    EAST;

    public String toString() {
        switch(this) {
            case NORTH: return "Polnoc";
            case SOUTH: return "Poludnie";
            case WEST: return "Zachod";
            case EAST: return "Wschod";
            default: return null;
        }
    }

    public MapDirection next() {
        switch(this) {
            case NORTH: return MapDirection.EAST;
            case SOUTH: return MapDirection.WEST;
            case WEST: return MapDirection.NORTH;
            case EAST: return MapDirection.SOUTH;
            default: return null;
        }
    }

    public MapDirection previous() {
        switch(this) {
            case NORTH: return MapDirection.WEST;
            case SOUTH: return MapDirection.EAST;
            case WEST: return MapDirection.SOUTH;
            case EAST: return MapDirection.NORTH;
            default: return null;
        }
    }

    public Vector2d toUnitVector() {
        switch(this) {
            case NORTH: return new Vector2d(1,0);
            case SOUTH: return new Vector2d(-1,0);
            case WEST: return new Vector2d(0,-1);
            case EAST: return new Vector2d(0,1);
            default: return null;
        }
    }
}
