package org.besqueet.mtwain.beidea.controllers;

import android.content.Context;
import android.content.res.Resources;
import org.besqueet.mtwain.beidea.R;

public class StringsController {

    private static String[]months;


    public static void initStrings(Context context){
        Resources res = context.getResources();
        months =  res.getStringArray(R.array.months);
    }

    public static String[] getMonths() {
        return months;
    }

    public static void setMonths(String[] months) {
        StringsController.months = months;
    }
}
