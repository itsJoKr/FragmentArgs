package dev.jokr.fragmentargs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import dev.jokr.fragmentarguments.FragmentArgs;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SampleFragment fragment = (SampleFragment) new FragmentArgs(SampleFragment.class)
                .setInt("number", 42)
                .setString("text", "Hello, World!")
                .create();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.layout_main, fragment)
                .commit();
    }
}
