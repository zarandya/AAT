package ch.bailu.aat.preferences.general;

import android.content.Context;

import ch.bailu.aat.R;
import ch.bailu.aat.preferences.SolidStaticIndexList;


public class SolidUnit extends SolidStaticIndexList {
    private static final String KEY="unit";

    static public final int IMPERIAL = 1;
    static public final int SI = 3;


    static private final float[] DIST_FACTOR = {1f / 1000f, 0.000621371f, 1f, 1f};
    static public final float[] ALT_FACTOR = {1, 3.28084f, 1f, 1f};
    static private final float[] SPEED_FACTOR = {3.6f, 2.23694f, 1f, 1f};
    static private final String[] DIST_UNIT = {"km", "miles", "m", "m"};
    static private final String[] SPEED_UNIT = {"km/h", "mph", "m/s", "m/s"};
    static public final String[] ALT_UNIT = {"m", "f", "m", "m"};
    
    public SolidUnit(Context c) {
        super(c, KEY,
                c.getResources().getStringArray(R.array.p_unit_list));
    }


    public float getDistanceFactor() {return DIST_FACTOR[getIndex()];}
    public float getAltitudeFactor() {return ALT_FACTOR[getIndex()];}
    public float getSpeedFactor() {return SPEED_FACTOR[getIndex()];}
        
    public String getDistanceUnit() {return DIST_UNIT[getIndex()];}
    public String getAltitudeUnit() {return ALT_UNIT[getIndex()];}
    public String getSpeedUnit() {return SPEED_UNIT[getIndex()];}
    
    @Override
    public String getLabel() {
        return getContext().getString(R.string.p_unit_title); 
    }

}
