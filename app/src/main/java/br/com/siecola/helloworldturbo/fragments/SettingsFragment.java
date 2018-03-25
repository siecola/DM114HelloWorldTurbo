package br.com.siecola.helloworldturbo.fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import br.com.siecola.helloworldturbo.R;

/**
 * Created by paulosiecola on 25/03/18.
 */

public class SettingsFragment extends PreferenceFragment {

    private String title;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.fragment_preferences);

        getActivity().setTitle("Configurações");
    }
}