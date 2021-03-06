package ansteph.com.sigandroid.view.teamviewer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

import ansteph.com.sigandroid.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TeamViewLanding extends Fragment {

    public static String TAG = TeamViewLanding.class.getSimpleName();
    public TeamViewLanding() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_team_view_landing, container, false);

        ListView fellowlist = (ListView) rootView.findViewById(R.id.listView);

        String[] itemlist = getActivity().getResources().getStringArray(R.array.fellowship);
       // ArrayList<String> items = new ArrayList<>(Arrays.asList(itemlist));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, itemlist);

        fellowlist.setAdapter(adapter);

        return rootView;
    }


}
