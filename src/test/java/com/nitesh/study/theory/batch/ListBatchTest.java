package com.nitesh.study.theory.batch;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ListBatchTest {

    private List<String> strSequences;

    @BeforeEach
    void setUp() {
        strSequences = new ArrayList<>();
        strSequences.add("1");
        strSequences.add("2");
        strSequences.add("3");
        strSequences.add("4");
        strSequences.add("5");
        strSequences.add("6");
        strSequences.add("7");
        strSequences.add("8");
        strSequences.add("9");
    }

    @AfterEach
    void tearDown() {
        strSequences = null;
    }

    @Test
    void getBatchesSuccessScenario() {
        List<List<String>> result = ListBatch.getBatches(strSequences, 2);
        assert result.size() == 5;
        assert result.get(0).size() == 2;
        assert result.get(1).size() == 2;
        assert result.get(2).size() == 2;
        assert result.get(3).size() == 2;
        assert result.get(4).size() == 1;
    }

    @Test
    void getBatchesEmptyListScenario() {
        List<List<String>> result = ListBatch.getBatches(new ArrayList<>(), 2);
        assert result.isEmpty();
    }

}