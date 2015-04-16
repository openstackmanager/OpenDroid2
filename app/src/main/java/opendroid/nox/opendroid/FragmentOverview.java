package opendroid.nox.opendroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by NOX on 16/04/2015.
 */
public class FragmentOverview extends Fragment{
    public static FragmentOverview newInstance(){
        FragmentOverview fragment = new FragmentOverview();
        return fragment;
    }

    public FragmentOverview(){}

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_overview, container, false);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        ((HomeScreen) activity).onSectionAttached(1);
    }
}
