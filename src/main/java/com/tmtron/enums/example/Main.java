package com.tmtron.enums.example;

import com.tmtron.enums.EnumMapperFull;
import com.tmtron.enums.EnumMappers;

// this project only includes tests
@EnumMappers({ColorEnum.class, BoolEnum.class})
public class Main {

    public static void main(String[] args) {
        EnumMapperFull<ColorEnum, String> fullColorMapper =
                ColorEnum_MapperFull
                        .setRED("red")
                        .setBLUE("blue")
                        .setGREEN("green");

        System.out.println("Green value = " + fullColorMapper.getValue(ColorEnum.GREEN));
    }
}
