package com.tmtron.enums.example;

import com.tmtron.enums.EnumMappers;

/**
 * Since enum-mapper V1.0.2 it is possible to use the
 * EnumMappers annotation on multiple classes, even with the same Enums.
 * Note: ColorEnum is also already used on the {@link Main} class
 */
@EnumMappers(ColorEnum.class)
public class Secondary {
}
