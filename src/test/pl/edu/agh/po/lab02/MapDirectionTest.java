package pl.edu.agh.po.lab02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapDirectionTest {

    @Test
    void next() {
        // given
        MapDirection mapdirection = MapDirection.NORTH;
        // when
        MapDirection result = mapdirection.next();
        // then
        assertEquals(MapDirection.EAST, result);

        // given
        mapdirection = MapDirection.EAST;
        // when
        result = mapdirection.next();
        // then
        assertEquals(MapDirection.SOUTH, result);

        // given
        mapdirection = MapDirection.SOUTH;
        // when
        result = mapdirection.next();
        // then
        assertEquals(MapDirection.WEST, result);

        // given
        mapdirection = MapDirection.WEST;
        // when
        result = mapdirection.next();
        // then
        assertEquals(MapDirection.NORTH, result);
    }

    @Test
    void previous() {
        // given
        MapDirection mapdirection = MapDirection.NORTH;
        // when
        MapDirection result = mapdirection.previous();
        //then
        assertEquals(MapDirection.WEST, result);

        // given
        mapdirection = MapDirection.WEST;
        // when
        result = mapdirection.previous();
        //then
        assertEquals(MapDirection.SOUTH, result);

        // given
        mapdirection = MapDirection.SOUTH;
        // when
        result = mapdirection.previous();
        //then
        assertEquals(MapDirection.EAST, result);

        // given
        mapdirection = MapDirection.EAST;
        // when
        result = mapdirection.previous();
        //then
        assertEquals(MapDirection.NORTH, result);
    }
}