package pl.edu.agh;

public class ValueContainer {
    private int valueInt;
    private float valueFloat;
    private boolean valueBoolean;
    private String valueString;

    public ValueContainer(int valueInt) {
        this.valueInt = valueInt;
    }

    public int getInt(){
        return valueInt;
    }
}
