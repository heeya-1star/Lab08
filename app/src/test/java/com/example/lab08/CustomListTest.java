package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);


        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void addCityTest() {
        CustomList list = new CustomList();
        int listSize = list.countCities();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(listSize + 1, list.countCities());
    }


}