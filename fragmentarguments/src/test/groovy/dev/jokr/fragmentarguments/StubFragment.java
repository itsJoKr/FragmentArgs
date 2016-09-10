package dev.jokr.fragmentarguments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by JoKr on 9/10/2016.
 */
public class StubFragment extends Fragment {

    private int someField;
    private boolean booleanField1;
    private boolean booleanField2;
    private String stringField;
    private MyObject objectField;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public int getSomeField() {
        return someField;
    }

    public boolean isBooleanField1() {
        return booleanField1;
    }

    public boolean isBooleanField2() {
        return booleanField2;
    }

    public String getStringField() {
        return stringField;
    }

    public MyObject getObjectField() {
        return objectField;
    }

    public static class MyObject {
        private int a;

        public MyObject(int a) {
            this.a = a;
        }

        public int getA() {return a;}
    }
}
