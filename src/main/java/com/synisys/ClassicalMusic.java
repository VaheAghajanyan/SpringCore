package com.synisys;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    @Override
    public List<String> getSong() {
        return new ArrayList<>(Arrays.asList("1. Classical Song 1", "Classical Song 2", "Classical Song 3"));
    }
}
