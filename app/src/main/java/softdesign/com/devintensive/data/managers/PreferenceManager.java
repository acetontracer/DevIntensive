package softdesign.com.devintensive.data.managers;

import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;

import softdesign.com.devintensive.utils.ConstantManager;
import softdesign.com.devintensive.utils.DevintensiveApplication;

public class PreferenceManager {

    private SharedPreferences mSharedPreferences;

    private static final String [] USER_FIELDS = {ConstantManager.USER_PHONE_KEY,ConstantManager.USER_MAIL_KEY,ConstantManager.USER_VK_KEY,ConstantManager.USER_GIT_KEY,ConstantManager.USER_BIO_KEY};

    public PreferenceManager() {
        this.mSharedPreferences = DevintensiveApplication.getSharedPreferences();
    }

    public void saveUserProfileData(List<String> userFields){
        SharedPreferences.Editor editor = mSharedPreferences.edit();

        for (int i=0;i<USER_FIELDS.length;i++){
            editor.putString(USER_FIELDS[i],userFields.get(i));
        }
        editor.apply();
    }

    public List<String> loadUserProfileData() {
        List<String> userFields = new ArrayList<>();
        userFields.add(mSharedPreferences.getString(ConstantManager.USER_PHONE_KEY, "null"));
        userFields.add(mSharedPreferences.getString(ConstantManager.USER_MAIL_KEY, "null"));
        userFields.add(mSharedPreferences.getString(ConstantManager.USER_VK_KEY, "null"));
        userFields.add(mSharedPreferences.getString(ConstantManager.USER_GIT_KEY, "null"));
        userFields.add(mSharedPreferences.getString(ConstantManager.USER_BIO_KEY, "null"));
        return userFields;
    }
}
