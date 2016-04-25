package mobile.application;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import mobile.application.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Login extends Fragment {

    // Store instance variables
    private String title;
    private int page;

    public static Login newInstance(int page, String title) {
        Login login = new Login();
        Bundle args = new Bundle();
        args.putInt("1", page);
        args.putString("Uno", title);
        login.setArguments(args);
        return login;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("1",0);
        title = getArguments().getString("Uno");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.tvLabel);
        tvLabel.setText(page + " -- " + title);
        return view;
    }
}
