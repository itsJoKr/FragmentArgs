package dev.jokr.fragmentargs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by JoKr on 9/10/2016.
 */
public class SampleFragment extends Fragment {

    private int number;
    private String text;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_sample, container, false);

        TextView txtNumber = (TextView) v.findViewById(R.id.some_number);
        txtNumber.setText("" + number);
        TextView txtText = (TextView) v.findViewById(R.id.some_text);
        txtText.setText(text);

        return v;
    }
}
