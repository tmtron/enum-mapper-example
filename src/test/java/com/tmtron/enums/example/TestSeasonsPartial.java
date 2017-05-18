package com.tmtron.enums.example;

import com.tmtron.enums.EnumMapperPartial;

import org.junit.Assert;
import org.junit.Test;

import static com.tmtron.enums.example.Seasons.FALL;
import static com.tmtron.enums.example.Seasons.SPRING;
import static com.tmtron.enums.example.Seasons.SUMMER;
import static com.tmtron.enums.example.Seasons.WINTER;

public class TestSeasonsPartial {

    EnumMapperPartial<Seasons, String> ExtremeSeasons =
            EnumMapperPartial.of(SUMMER, "Sommer"
                    , WINTER, "Winter");

    @Test
    public void testSummer() {
        Assert.assertEquals("Sommer", ExtremeSeasons.getValueOrNull(SUMMER));
    }

    @Test
    public void testWinter() {
        Assert.assertEquals("Winter", ExtremeSeasons.getValueOrNull(WINTER));
    }

    @Test
    public void testSpringIsNull() {
        Assert.assertNull(ExtremeSeasons.getValueOrNull(SPRING));
    }

    @Test
    public void testSprintDefault() {
        Assert.assertEquals("not extreme", ExtremeSeasons.getValueOrDefault(SPRING, "not extreme"));
    }

    @Test
    public void testSummerRevers() {
        Assert.assertEquals(SUMMER, ExtremeSeasons.getEnumOrNull("Sommer"));
    }

    @Test
    public void testSpringReverseNull() {
        Assert.assertNull(ExtremeSeasons.getEnumOrNull("Fruehling"));
    }

    @Test
    public void testSpringReverseDefault() {
        Assert.assertEquals(FALL, ExtremeSeasons.getEnumOrDefault("Fruehling", FALL));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSpringReverseRaise() {
        ExtremeSeasons.getEnumOrRaise("Fruehling");
    }

}

