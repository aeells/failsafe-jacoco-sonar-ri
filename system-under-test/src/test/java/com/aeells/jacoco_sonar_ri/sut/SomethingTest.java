package com.aeells.jacoco_sonar_ri.sut;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

public final class SomethingTest
{
    @Test
    public void assertTheMagicNumber()
    {
        MatcherAssert.assertThat(new Something().whatsTheMagicNumber(), CoreMatchers.equalTo(3));
    }
}