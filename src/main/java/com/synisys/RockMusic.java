package com.synisys;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music {
    @Override
    public List<String> getSong() {
        return new ArrayList<>(Arrays.asList("1. Rock Song 1", "Rock Song 2", "Rock Song 3"));
    }
}
