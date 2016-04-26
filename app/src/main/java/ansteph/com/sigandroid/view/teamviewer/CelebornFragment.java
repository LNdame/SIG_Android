package ansteph.com.sigandroid.view.teamviewer;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ansteph.com.sigandroid.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CelebornFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CelebornFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CelebornFragment extends Fragment {

    public static String TAG = CelebornFragment.class.getSimpleName();


    public CelebornFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_celeborn, container, false);
        ListView fellowlist = (ListView) rootView.findViewById(R.id.listView);

        String[] itemlist = getActivity().getResources().getStringArray(R.array.fellowship);
        // ArrayList<String> items = new ArrayList<>(Arrays.asList(itemlist));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, itemlist);

        fellowlist.setAdapter(adapter);
        return rootView;
    }


}
