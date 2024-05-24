package com.nitesh.study.theory.batch;

import java.util.ArrayList;
import java.util.List;

public class ListBatch {

    public static <T> List<List<T>> getBatches(List<T> list, int batchSize) {
        List<List<T>> batchesList = new ArrayList<List<T>>();
        if (list.isEmpty()) {
            return batchesList;
        }
        int index = 0;
        while (index < list.size()) {
            batchesList.add(list.subList(index, Math.min(index+batchSize, list.size())));
            index += batchSize;
        }
        return batchesList;
    }
}
