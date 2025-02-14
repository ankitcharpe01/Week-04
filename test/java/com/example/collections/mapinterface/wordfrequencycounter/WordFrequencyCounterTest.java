package com.example.collections.mapinterface.wordfrequencycounter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordFrequencyCounterTest {

    private WordFrequencyCounter wordFrequencyCounter;

    @BeforeEach
    void setUp() {
        wordFrequencyCounter = new WordFrequencyCounter();
    }

    @Test
    void testFindFrequency_SimpleCase() {
        String text = "hello world hello";
        Map<String, Integer> frequencyMap = wordFrequencyCounter.findFrequency(text);

        assertEquals(2, frequencyMap.get("hello"));
        assertEquals(1, frequencyMap.get("world"));
    }

}
