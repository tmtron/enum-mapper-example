package com.tmtron.enums.example;

import com.tmtron.enums.EnumMapperFull;

import org.junit.Assert;
import org.junit.Test;

import static com.tmtron.enums.example.ColorEnum.BLUE;
import static com.tmtron.enums.example.ColorEnum.GREEN;
import static com.tmtron.enums.example.ColorEnum.RED;

public class TestColorMapperFull {

    private static EnumMapperFull<ColorEnum, String> germanColors = ColorEnum_MapperFull
            .setRED("rot")
            .setBLUE("blau")
            .setGREEN("gruen");

    @Test
    public void assertGermanSeasons() {
        Assert.assertEquals("rot", germanColors.getValue(RED));
        Assert.assertEquals("blau", germanColors.getValue(BLUE));
        Assert.assertEquals("gruen", germanColors.getValue(GREEN));
    }
}