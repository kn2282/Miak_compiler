package pl.edu.agh;

import java.util.HashMap;

public class MemoryPool {
    private HashMap<String, ValueContainer> memory;
    private MemoryPool widerScopePool;

    public MemoryPool(MemoryPool widerScopePool) {
        this.widerScopePool = widerScopePool;
        this.memory = new HashMap();
    }

    public ValueContainer get(String key, int level) {

            switch (level) {
                case 0: //szukanie w obecnym scopie/zasiêgu
                    if (memory.containsKey(key))
                        return memory.get(key);
                    else return widerScopePool.get(key, 0);

                case 1: //szukanie w zasiêgu wy¿ej
                    return widerScopePool.get(key, 0);

                case 2: //szukanie w zasiêgu globalnym
                    if (widerScopePool == null) {
                        return memory.get(key);
                    } else {
                        return widerScopePool.get(key, 2);
                    }
            }
        return null;
    }
    private void safeSet(String key, ValueContainer val){
        if (memory.containsKey(key)) {
            memory.replace(key, val);
        } else {
            memory.put(key, val);
        }
    }
    public void set(String key, ValueContainer val, int level) {
        switch (level) {
            case 0:
                safeSet(key,val);
                break;
            case 1:
                if (widerScopePool == null)
                    safeSet(key,val);
                else
                    widerScopePool.set(key, val, 0);
                break;
            case 2:
                if (widerScopePool == null)
                    safeSet(key,val);
                else
                    widerScopePool.set(key, val, 2);
                break;
        }


    }

    public void update(String key, ValueContainer val) {
        memory.replace(key, val);//todo
    }
}
