package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by austincunningham on 05/12/17.
 */

public class BitcoinDataModel {

    private String mCurrency;

    public static BitcoinDataModel fromJson(JSONObject jsonObject){
        try{
            BitcoinDataModel bitcoinData = new BitcoinDataModel();
            bitcoinData.mCurrency = jsonObject.getJSONObject("averages").getString("day");
            return  bitcoinData;

        } catch (JSONException e){
            e.printStackTrace();
            return null;
        }
    }

    public String getCurrency() {
        return mCurrency;
    }
}
