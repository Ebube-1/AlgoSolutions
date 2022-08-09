package com.ebube.mondayAlgorithms;


//// All operations below are performed sequentially.
//LRUCache(3): - // instantiate an LRUCache of size 3
//insertKeyValuePair("b", 2): -
//insertKeyValuePair("a", 1): -
//insertKeyValuePair("c", 3): -
//getMostRecentKey(): "c" // "c" was the most recently inserted key
//getValueFromKey("a"): 1
//getMostRecentKey(): "a" // "a" was the most recently retrieved key
//insertKeyValuePair("d", 4): - // the cache had 3 entries; the least recently used one is evicted
//getValueFromKey("b"): None // "b" was evicted in the previous operation
//insertKeyValuePair("a", 5): - // "a" already exists in the cache so its value just gets replaced
//getValueFromKey("a"): 5

public class LRUCacheProgram {
    static class LRUCache {
        int maxSize;

        public LRUCache(int maxSize) {
            this.maxSize = maxSize > 1 ? maxSize : 1;
        }

        public void insertKeyValuePair(String key, int value) {
            // Write your code here.
        }

        public LRUResult getValueFromKey(String key) {
            // Write your code here.
            return null;
        }

        public String getMostRecentKey() {
            // Write your code here.
            return null;
        }
    }

    static class LRUResult {
        boolean found;
        Integer value;

        public LRUResult(boolean found, Integer value) {
            this.found = found;
            this.value = value;
        }
    }
}
