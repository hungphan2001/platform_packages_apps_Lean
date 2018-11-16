package com.lean.settings.fragments;
 import com.android.internal.logging.nano.MetricsProto;
 import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemProperties;
import android.os.UserHandle;
import android.support.v7.preference.ListPreference;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceScreen;
import android.support.v7.preference.Preference.OnPreferenceChangeListener;
import android.support.v14.preference.SwitchPreference;
import android.provider.Settings;
import com.android.settings.R;
 import java.util.Arrays;
import java.util.HashSet;
 import com.android.settings.SettingsPreferenceFragment;
 public class MiscSettings extends SettingsPreferenceFragment implements
        OnPreferenceChangeListener {
  private static final String KEY_DEVICE_PART = "advanced_controls";
    private static final String KEY_DEVICE_PART_PACKAGE_NAME = "com.thht.settings.device";
     @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
         addPreferencesFromResource(R.xml.lean_settings_misc);
     // Advanced Controls
        if (!com.lean.settings.preferences.Utils.isPackageInstalled(getActivity(), KEY_DEVICE_PART_PACKAGE_NAME)) {
            getPreferenceScreen().removePreference(findPreference(KEY_DEVICE_PART));
        }
     }
     @Override
    public boolean onPreferenceChange(Preference preference, Object objValue) {
         return false;
    }
     @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.LEAN;
    }
}
