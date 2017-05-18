package com.tmtron.enums.example;

public enum AlternativeSeasons {

    SPRING {
        @Override
        public String getGermanName() {
            return "Fruehling";
        }
    }, SUMMER {
        @Override
        public String getGermanName() {
            return "Sommer";
        }
    }, FALL {
        @Override
        public String getGermanName() {
            return "Herbst";
        }
    }, WINTER {
        @Override
        public String getGermanName() {
            return "Winter";
        }
    };

    public abstract String getGermanName();
}
