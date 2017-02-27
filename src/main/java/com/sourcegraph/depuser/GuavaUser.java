package com.sourcegraph.depuser;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

public class GuavaUser {
    public void callStrings() {
        Strings.isNullOrEmpty("hi");
    }

    public void callJoin() {
        List<String> parts = Arrays.asList("a", "b", "c", null);
        String joined = Joiner.on(", ").skipNulls().join(parts);
    }

    public void callIterables() {
        List<String> names = Lists.newArrayList("a", "b", "c");
        Iterable<Integer> nameSizes1 = Iterables.transform(names,
                new Function<String, Integer>() {
                    public Integer apply(String s) {
                        return s.length();
                    }
                }
        );
    }

    public void useBiMap() {
        BiMap<String, String> b = HashBiMap.create();
    }
}