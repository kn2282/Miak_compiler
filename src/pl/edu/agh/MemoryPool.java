package pl.edu.agh;

import java.util.HashMap;

public class MemoryPool {
    private HashMap<String, ValueContainer> memory;
    private MemoryPool widerScopePool;

    public MemoryPool(MemoryPool widerScopePool) {
        this.widerScopePool = widerScopePool;
        this.memory = new HashMap();
    }

    public ValueContainer get(String key) {
        if (memory.containsKey(key))
            return memory.get(key);
        else return widerScopePool.get(key);
    }

    public void set(String key, ValueContainer val) {

        if (memory.containsKey(key)){
            memory.replace(key, val);
        }
        else {
            memory.put(key, val);
        }
    }

    public void update(String key, ValueContainer val) {
        memory.replace(key, val);//todo
    }
}
