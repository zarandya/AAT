package ch.bailu.aat.description;

import ch.bailu.aat.gpx.GpxInformation;


public interface OnContentUpdatedInterface {
    static final OnContentUpdatedInterface NULL = new OnContentUpdatedInterface() {
        @Override
        public void onContentUpdated(GpxInformation info) {

        }
    };

    void onContentUpdated(GpxInformation info);
}
