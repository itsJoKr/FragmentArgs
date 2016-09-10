package dev.jokr.fragmentarguments

import spock.lang.Specification

/**
 * Created by JoKr on 9/10/2016.
 */
class FragmentArgsTest extends Specification {

    def "Fragment class is set in FragmentArgs"() {
        when:
        FragmentArgs sut = new FragmentArgs(StubFragment.class)

        then:
        sut.getFragmentClass().getName() == StubFragment.class.getName()
    }

    def "Set int field"() {
        when:
        StubFragment stubFragment = (StubFragment) new FragmentArgs(StubFragment.class)
            .setInt("someField", 7)
            .create()

        then:
        stubFragment.someField == 7
    }

    def "Set two boolean fields"() {
        when:
        StubFragment stubFragment = (StubFragment) new FragmentArgs(StubFragment.class)
            .setBoolean("booleanField1", true)
            .setBoolean("booleanField2", false)
            .create()

        then:
        stubFragment.booleanField1
        !stubFragment.booleanField2
    }

    def "Set string field"() {
        given:
        def sampleString = "sampleString"

        when:
        StubFragment stubFragment = (StubFragment) new FragmentArgs(StubFragment.class)
                .setString("stringField", sampleString)
                .create()

        then:
        stubFragment.stringField == sampleString
    }

    def "Set object field"() {
        given:
        StubFragment.MyObject object = new StubFragment.MyObject(2)

        when:
        StubFragment stubFragment = (StubFragment) new FragmentArgs(StubFragment.class)
                .setObject("objectField", object)
                .create()

        then:
        stubFragment.objectField.a == 2
        stubFragment.objectField.is(object)
    }
}
