# FragmentArgs

DISCLAIMER: Do not use this library in real projects. This is made just for fun and it's flawed as hell.

Don't you hate that best part of Android SDK - Fragments, lack a constructor (and few more lifecycle methods)?

Are you tired of writing multiple newInstance( ) methods and those ugly bundles every time?

**Here is solution for you! It's called FragmentArgs!**

### Usage

First declare fields that you need in your fragment:
```
public class SampleFragment extends Fragment {

    private int number;
    private String text;
```

Then, tell FragmentArgs to inject your arguments into these fields:
```
 SampleFragment fragment = (SampleFragment) new FragmentArgs(SampleFragment.class)
                .setInt("number", 42)
                .setString("text", "Hello, World!")
                .create();
```

You can pass primitives and objects. Objects won't be recreated (serialized), they will be same instance as passed object.

