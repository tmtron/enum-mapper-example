package com.tmtron.enums.example;

import com.tmtron.enums.EnumMapperPartial;

import org.junit.Assert;
import org.junit.Test;

import static com.tmtron.enums.example.Seasons.FALL;
import static com.tmtron.enums.example.Seasons.SPRING;
import static com.tmtron.enums.example.Seasons.SUMMER;
import static com.tmtron.enums.example.Seasons.WINTER;

public class TestSeasonsPartial {

    EnumMapperPartial<Seasons, String> extremeSeasons =
            EnumMapperPartial.of(SUMMER, "Sommer"
                    , WINTER, "Winter");

    @Test
    public void testSummer() {
        Assert.assertEquals("Sommer", extremeSeasons.getValueOrNull(SUMMER));
    }

    @Test
    public void testWinter() {
        Assert.assertEquals("Winter", extremeSeasons.getValueOrNull(WINTER));
    }

    @Test
    public void testSpringIsNull() {
        Assert.assertNull(extremeSeasons.getValueOrNull(SPRING));
    }

    /**
     * @since V1.0.3
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSpringRaises() {
        extremeSeasons.getValueOrRaise(SPRING);
    }

    /**
     * @since V1.0.3
     */
    @Test
    public void testIsEnumMapped() {
        Assert.assertTrue(extremeSeasons.isEnumMapped(SUMMER));
        Assert.assertTrue(extremeSeasons.isEnumMapped(WINTER));
    }

    /**
     * @since V1.0.3
     */
    @Test
    public void testIsEnumMapped_returns_false() {
        Assert.assertFalse(extremeSeasons.isEnumMapped(SPRING));
        Assert.assertFalse(extremeSeasons.isEnumMapped(FALL));
    }


    /**
     * @since V1.0.3
     */
    @Test
    public void testIsValueMapped() {
        Assert.assertTrue(extremeSeasons.isValueMapped("Sommer"));
        Assert.assertTrue(extremeSeasons.isValueMapped("Winter"));
    }

    /**
     * @since V1.0.3
     */
    @Test
    public void testIsValueMapped_returns_false() {
        Assert.assertFalse(extremeSeasons.isValueMapped("Fruehling"));
        Assert.assertFalse(extremeSeasons.isValueMapped("Herbst"));
    }

    @Test
    public void testSpringDefault() {
        Assert.assertEquals("not extreme", extremeSeasons.getValueOrDefault(SPRING, "not extreme"));
    }

    @Test
    public void testSummerRevers() {
        Assert.assertEquals(SUMMER, extremeSeasons.getEnumOrNull("Sommer"));
    }

    @Test
    public void testSpringReverseNull() {
        Assert.assertNull(extremeSeasons.getEnumOrNull("Fruehling"));
    }

    @Test
    public void testSpringReverseDefault() {
        Assert.assertEquals(FALL, extremeSeasons.getEnumOrDefault("Fruehling", FALL));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSpringReverseRaise() {
        extremeSeasons.getEnumOrRaise("Fruehling");
    }

}

