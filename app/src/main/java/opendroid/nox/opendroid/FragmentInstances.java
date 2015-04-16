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
public class FragmentInstances extends Fragment{
    public static FragmentInstances newInstance(){
        FragmentInstances fragment = new FragmentInstances();
        return fragment;
    }

    public FragmentInstances(){}

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_instances, container, false);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        ((HomeScreen) activity).onSectionAttached(2);
    }
}
