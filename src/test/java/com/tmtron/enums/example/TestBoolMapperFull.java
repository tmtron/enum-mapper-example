package com.tmtron.enums.example;

import com.tmtron.enums.EnumMapperFull;

import org.junit.Assert;
import org.junit.Test;

import static com.tmtron.enums.example.BoolEnum.OFF;
import static com.tmtron.enums.example.BoolEnum.ON;

public class TestBoolMapperFull {

    private static EnumMapperFull<BoolEnum, String> germanBool = BoolEnum_MapperFull
            .setON("ein")
            .setOFF("aus");

    @Test
    public void assertGermanSeasons() {
        Assert.assertEquals("ein", germanBool.getValue(ON));
        Assert.assertEquals("aus", germanBool.getValue(OFF));
    }
}