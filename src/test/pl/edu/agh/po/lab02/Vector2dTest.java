package pl.edu.agh.po.lab02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector2dTest {

    @Test
    void testEquals() {
        // given
        Vector2d vector2d = new Vector2d(1,2);
        // when
        boolean result = vector2d.equals(vector2d);
        //then
        assertEquals(true, result);

        // given
        vector2d = new Vector2d(2,3);
        MapDirection mapdir = MapDirection.NORTH;
        // when
        result = vector2d.equals(mapdir);
        // then
        assertEquals(false, result);

        // given
        Vector2d one = new Vector2d(1,2);
        Vector2d another = new Vector2d(2,3);
        // when
        result = one.equals(another);
        // then
        assertEquals(false, result);

        //given
        one = new Vector2d (1,2);
        another = new Vector2d(1,2);
        //when
        result = one.equals(another);
        //then
        assertEquals(true,result);
    }

    @Test
    void testToString() {
        // given
        Vector2d vector2d = new Vector2d(1,2);
        // when
        String result = vector2d.toString();
        // then
        assertEquals("(1,2)",result);
    }

    @Test
    void testPrecedes() {
        // given
        Vector2d one = new Vector2d(3,4);
        Vector2d another = new Vector2d(3,4);
        // when
        boolean result = one.precedes(another);
        // then
        assertEquals(true, result);

        // given
        one = new Vector2d(3,4);
        another = new Vector2d(2,4);
        // when
        result = one.precedes(another);
        // then
        assertEquals(true, result);

        // given
        one = new Vector2d(3,4);
        another = new Vector2d(3,3);
        // when
        result = one.precedes(another);
        // then
        assertEquals(true, result);

        // given
        one = new Vector2d(3,4);
        another = new Vector2d(4,4);
        // when
        result = one.precedes(another);
        // then
        assertEquals(false, result);

        // given
        one = new Vector2d(3,4);
        another = new Vector2d(3,5);
        // when
        result = one.precedes(another);
        // then
        assertEquals(false, result);
    }

    @Test
    void testFollows() {
        // given
        Vector2d one = new Vector2d(3,4);
        Vector2d another = new Vector2d(3,4);
        // when
        boolean result = one.follows(another);
        // then
        assertEquals(true, result);

        // given
        one = new Vector2d(3,4);
        another = new Vector2d(2,4);
        // when
        result = one.follows(another);
        // then
        assertEquals(false, result);

        // given
        one = new Vector2d(3,4);
        another = new Vector2d(3,3);
        // when
        result = one.follows(another);
        // then
        assertEquals(false, result);

        // given
        one = new Vector2d(3,4);
        another = new Vector2d(4,4);
        // when
        result = one.follows(another);
        // then
        assertEquals(true, result);

        // given
        one = new Vector2d(3,4);
        another = new Vector2d(3,5);
        // when
        result = one.follows(another);
        // then
        assertEquals(true, result);

    }

    @Test
    void testUpperRight() {
        // given
        Vector2d one = new Vector2d(2,13);
        Vector2d another = new Vector2d(7, 3);
        // when
        Vector2d result = one.upperRight(another);
        // then
        assertEquals(new Vector2d(7,13),result);

        // given
        one = new Vector2d(7,13);
        another = new Vector2d(7, 13);
        // when
        result = one.upperRight(another);
        // then
        assertEquals(new Vector2d(7,13),result);
    }

    @Test
    void testLowerLeft() {
        // given
        Vector2d one = new Vector2d(2,13);
        Vector2d another = new Vector2d(7, 3);
        // when
        Vector2d result = one.lowerLeft(another);
        // then
        assertEquals(new Vector2d(2,3),result);

        // given
        one = new Vector2d(2,3);
        another = new Vector2d(2, 3);
        // when
        result = one.lowerLeft(another);
        // then
        assertEquals(new Vector2d(2,3),result);
    }

    @Test
    void testAdd() {
        // given
        Vector2d one = new Vector2d(1,2);
        Vector2d another = new Vector2d(3,4);
        // when
        Vector2d result = one.add(another);
        // then
        assertEquals(new Vector2d(1+3,2+4), result);

        // given
        one = new Vector2d(7,13);
        another = new Vector2d(-7,-13);
        // when
        result = one.add(another);
        // then
        assertEquals(new Vector2d(0,0), result);
    }

    @Test
    void testSubtract() {
        // given
        Vector2d one = new Vector2d(3,4);
        Vector2d another = new Vector2d(1,2);
        // when
        Vector2d result = one.subtract(another);
        // then
        assertEquals(new Vector2d(2,2), result);

        // given
        one = new Vector2d(7,13);
        another = new Vector2d(7,13);
        // when
        result = one.subtract(another);
        // then
        assertEquals(new Vector2d(0,0), result);
    }

    @Test
    void testOpposite() {
        // given
        Vector2d vector = new Vector2d(7,13);
        //when
        Vector2d result = vector.opposite();
        //then
        assertEquals(new Vector2d(-7,-13), result);

        // given
        vector = new Vector2d(0,0);
        //when
        result = vector.opposite();
        //then
        assertEquals(new Vector2d(0,0), result);
    }
}