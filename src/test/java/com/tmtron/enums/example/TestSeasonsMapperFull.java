package com.tmtron.enums.example;

import com.tmtron.enums.EnumMapperFull;

import org.junit.Assert;
import org.junit.Test;

import static com.tmtron.enums.example.Seasons.FALL;
import static com.tmtron.enums.example.Seasons.SPRING;
import static com.tmtron.enums.example.Seasons.SUMMER;
import static com.tmtron.enums.example.Seasons.WINTER;

public class TestSeasonsMapperFull {

    private static EnumMapperFull<Seasons, String> germanSeasons = Seasons_MapperFull
            .setSPRING("Fruehling")
            .setSUMMER("Sommer")
            .setFALL("Herbst")
            .setWINTER("Winter");

    private static EnumMapperFull<Seasons, Integer> seasonNumbers = Seasons_MapperFull
            .setSPRING(1)
            .setSUMMER(2)
            .setFALL(3)
            .setWINTER(4);

    @Test
    public void assertGermanSeasons() {
        Assert.assertEquals("Fruehling", germanSeasons.getValue(SPRING));
        Assert.assertEquals("Sommer", germanSeasons.getValue(SUMMER));
        Assert.assertEquals("Herbst", germanSeasons.getValue(FALL));
        Assert.assertEquals("Winter", germanSeasons.getValue(WINTER));
    }

    @Test
    public void assertGermanSeasonsReverse() {
        Assert.assertEquals(SPRING, germanSeasons.getEnumOrRaise("Fruehling"));
        Assert.assertEquals(SUMMER, germanSeasons.getEnumOrRaise("Sommer"));
        Assert.assertEquals(FALL, germanSeasons.getEnumOrRaise("Herbst"));
        Assert.assertEquals(WINTER, germanSeasons.getEnumOrRaise("Winter"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void assertGermanSeasonsReverseRaises() {
        Assert.assertEquals(SPRING, germanSeasons.getEnumOrRaise("InvalidConstant"));
    }

    @Test
    public void assertGermanSeasonsReverseNull() {
        Assert.assertNull(germanSeasons.getEnumOrNull("InvalidConstant"));
    }

    @Test
    public void assertGermanSeasonsReverseDefault() {
        Assert.assertEquals(SPRING, germanSeasons.getEnumOrDefault("InvalidConstant", SPRING));
    }

    @Test
    public void assertSeasonNumbers() {
        Assert.assertEquals(Integer.valueOf(1), seasonNumbers.getValue(SPRING));
        Assert.assertEquals(Integer.valueOf(2), seasonNumbers.getValue(SUMMER));
        Assert.assertEquals(Integer.valueOf(3), seasonNumbers.getValue(FALL));
        Assert.assertEquals(Integer.valueOf(4), seasonNumbers.getValue(WINTER));
    }

}
