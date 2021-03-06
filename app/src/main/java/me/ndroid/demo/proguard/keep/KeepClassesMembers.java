package me.ndroid.demo.proguard.keep;

public class KeepClassesMembers implements INameInterface {
    private NameField field;

    public void setName(String name) {
        field = new NameField(name);
    }

    public String getName() {
        return field == null ? "null" : field.get();
    }
}
