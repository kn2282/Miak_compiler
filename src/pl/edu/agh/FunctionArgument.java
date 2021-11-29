package pl.edu.agh;

public class FunctionArgument {
    private String name;
    private ValueContainer value;

    public ValueContainer getValue() {
        return value;
    }


    public String getName() {
        return name;
    }

    public FunctionArgument(String name, int value){
        this.name=name;
        this.value = new ValueContainer(value);
    }
}
