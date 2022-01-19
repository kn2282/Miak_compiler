package pl.edu.agh;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class ValueContainer {
    private int valueInt;
    private float valueFloat;
    private boolean valueBoolean;
    private String valueString;
    private ValueType valueType;

    public ValueContainer(int valueInt) {
        this.valueInt = valueInt;
        valueType = ValueType.Integer;
    }

    public ValueContainer(float valueFloat) {
        this.valueFloat = valueFloat;
        valueType = ValueType.Float;
    }

    public Number getValue(){
        switch (valueType){
            case Integer:
                return valueInt;
            case Float:
                return valueFloat;
        }
        return 0;
    }

    public ValueType getValueType() {
        return valueType;
    }

    public ValueContainer add(ValueContainer other){
        switch (valueType){
            case Float:
                return new ValueContainer(valueFloat + other.getValue().floatValue());
            case Integer:
                if (other.getValueType() == ValueType.Integer)
                    return new ValueContainer(valueInt + other.valueInt );
                else
                    return new ValueContainer(valueInt + other.valueFloat );
            default:
                throw new ValueException("incorrect value type");
        }
    }

    public ValueContainer minus(ValueContainer other){
        switch (valueType){
            case Float:
                return new ValueContainer(valueFloat - other.getValue().floatValue());
            case Integer:
                if (other.getValueType() == ValueType.Integer)
                    return new ValueContainer(valueInt - other.valueInt );
                else
                    return new ValueContainer(valueInt - other.valueFloat );
            default:
                throw new ValueException("incorrect value type");
        }
    }

    public ValueContainer mul(ValueContainer other){
        switch (valueType){
            case Float:
                return new ValueContainer(valueFloat * other.getValue().floatValue());
            case Integer:
                if (other.getValueType() == ValueType.Integer)
                    return new ValueContainer(valueInt * other.valueInt );
                else
                    return new ValueContainer(valueInt * other.valueFloat );
            default:
                throw new ValueException("incorrect value type");
        }
    }

    public ValueContainer divide(ValueContainer other){
        switch (valueType){
            case Float:
                return new ValueContainer(valueFloat / other.getValue().floatValue());
            case Integer:
                if (other.getValueType() == ValueType.Integer)
                    return new ValueContainer(valueInt / other.valueInt );
                else
                    return new ValueContainer(valueInt / other.valueFloat );
            default:
                throw new ValueException("incorrect value type");
        }
    }

    public ValueContainer add(Number other){
        switch (valueType){
            case Float:
                return new ValueContainer(valueFloat + other.floatValue());
            case Integer:
                if (other instanceof Integer)
                    return new ValueContainer(valueInt + (int) other);
                else
                    return new ValueContainer(valueInt + other.floatValue());
            default:
                throw new ValueException("incorrect value type");
        }
    }

    public ValueContainer minus(Number other){
        switch (valueType){
            case Float:
                return new ValueContainer(valueFloat - other.floatValue());
            case Integer:
                if (other instanceof Integer)
                    return new ValueContainer(valueInt - (int) other);
                else
                    return new ValueContainer(valueInt - other.floatValue() );
            default:
                throw new ValueException("incorrect value type");
        }
    }

    public ValueContainer mul(Number other){
        switch (valueType){
            case Float:
                return new ValueContainer(valueFloat * other.floatValue());
            case Integer:
                if (other instanceof Integer)
                    return new ValueContainer(valueInt * (int) other);
                else
                    return new ValueContainer(valueInt * other.floatValue() );
            default:
                throw new ValueException("incorrect value type");
        }
    }

    public ValueContainer divide(Number other){
        switch (valueType){
            case Float:
                return new ValueContainer(valueFloat / other.floatValue());
            case Integer:
                if (other instanceof Integer)
                    return new ValueContainer(valueInt / (int) other);
                else
                    return new ValueContainer(valueInt / other.floatValue() );
            default:
                throw new ValueException("incorrect value type");
        }
    }

    public ValueContainer adversity(){
        switch (valueType){
            case Integer:
                return new ValueContainer(-valueInt);
            case Float:
                return new ValueContainer(-valueFloat);
        }
        throw new ValueException("incorrect value type");
    }

    public String toString(){
        switch (valueType){
            case Float:
                return Float.toString(valueFloat);
            case Integer:
                return Integer.toString(valueInt);
        }
        return "0";
    }
}
