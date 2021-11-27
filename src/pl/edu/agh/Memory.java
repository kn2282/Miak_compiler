package pl.edu.agh;

import java.util.HashMap;

public class Memory {
    private HashMap<String, ValueContainer> memory;

    public Memory() {
        this.memory = new HashMap();
    }

    public ValueContainer get(String key) {
        return memory.get(key);
    }

    public void add(String key, ValueContainer val) {
        memory.put(key, val);
    }

    public void update(String key, ValueContainer val) {
        memory.replace(key, val);//todo
    }
}
