package com.concretepage;

import java.util.Map;

class Test {

    private Map<String,String> data;

    Test() {}

    public Test(Map<String,String> data) {
        this.data = data;
    }

    public Map<String, String> getData() {
        return data;
    }
}
