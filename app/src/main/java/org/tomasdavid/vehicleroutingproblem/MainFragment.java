package org.tomasdavid.vehicleroutingproblem;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class MainFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        Button button = (Button) view.findViewById(R.id.button_open_file);
        button.setOnClickListener(new OpenFileButtonClick());
        return view;
    }

    private class OpenFileButtonClick implements OnClickListener {

        @Override
        public void onClick(View v) {
            VrpFileListFragment a = new VrpFileListFragment();
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.activity_main, a);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}