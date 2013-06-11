package com.example.test;
import java.util.HashMap;

/**
 * Created by sylphs on 13/06/11.
 */
public class TestData {
    private String mUrl;
    private boolean mMode;
    private HashMap<String , String> mDataMap;

    public TestData()
    {
        setUrl("");
        setMode(false);
        setDataMap(new HashMap<String , String >());
    }

    public TestData( String aUrl , boolean aMode , HashMap<String, String> aDataMap )
    {
        setUrl(aUrl);
        setMode(aMode);
        setDataMap(aDataMap);
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public boolean isMode() {
        return mMode;
    }

    public void setMode(boolean mMode) {
        this.mMode = mMode;
    }

    public HashMap<String, String> getDataMap() {
        return mDataMap;
    }

    public void setDataMap(HashMap<String, String> mDataMap) {
        this.mDataMap = mDataMap;
    }
}
