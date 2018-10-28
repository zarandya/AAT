package ch.bailu.aat.preferences;

import android.content.Context;

import ch.bailu.aat.util.ui.AppLog;

public class SolidInteger extends AbsSolidType {
    private final String key;
    private final Storage storage;
    
    
    public SolidInteger(Context c, String k) {
        storage=new Storage(c);
        key=k;
    }

    
    public int getValue() {
        return getStorage().readInteger(getKey());
    }
    
    
    public void setValue(int v) {
        getStorage().writeInteger(getKey(),v);
    }
    

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public Storage getStorage() {
        return storage;
    }

    @Override
    public String getValueAsString() {
        return String.valueOf(getValue());
    }

    @Override
    public void setValueFromString(String s) {
        try {
            setValue(Integer.valueOf(s));
        } catch (NumberFormatException e) {
            AppLog.e(getContext(), e);
        }

    }
}
