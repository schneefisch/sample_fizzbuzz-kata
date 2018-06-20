package com.icc.katasampleproject;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

/*
 ----------------------------------------------
 (c)2018 Copyright iC Consult GmbH
 <p/>
 Project: kata-sample-project
 Created by florian on 20.06.18.
 ----------------------------------------------
 */
class FizzBuzzTest {

    @Test
    void fizzBuzz_numbers() {
        assertThat(FizzBuzz.fizzBuzz(1), is("1"));
    }
}