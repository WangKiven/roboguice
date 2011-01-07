package roboguice.astroboy.service;


import android.preference.Preference;

import com.google.inject.Inject;

import roboguice.astroboy.service.ToastContextObserverService.ToastEvent;
import roboguice.event.EventManager;

/**
 * @author John Ericksen
 **/
public class PreferenceChangeEventToastListener implements Preference.OnPreferenceChangeListener {

    @Inject protected EventManager eventManager;
    @Inject protected ToastContextObserverService toastService;

    public boolean onPreferenceChange(Preference preference, Object o) {
        //raise the ToastEvent
        eventManager.notify(new ToastEvent("hello toast"));
        return true;
    }
}