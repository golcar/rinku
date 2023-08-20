package com.rinku.backoffice.utils;

public abstract class Constants {

    public static Long ROL_ALL= 0L;
    public enum TypeSalary{
        PERCENTAGE_FOR_HOUR,
        PERCENTAGE_FOR_WEEK,
        PERCENTAGE_FOR_MONTH,
        PERCENTAGE_FOR_EVENT,
        AMOUNT_FOR_HOUR,
        AMOUNT_FOR_WEEK,
        AMOUNT_FOR_MONTH,
        AMOUNT_FOR_EVENT;

    }

    public enum TypeMoviment{
        PERCENTAGE,
        AMOUNT;
    }
}
