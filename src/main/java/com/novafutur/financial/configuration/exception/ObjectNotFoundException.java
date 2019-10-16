package com.novafutur.financial.configuration.exception;

public class ObjectNotFoundException extends RuntimeException {

    private int id;



    private Class type;

    public ObjectNotFoundException(int id, Class type) {

        super("Could not find object type " + type.getName() + " id: " + id);

        this.id = id;
        this.type = type;


    }

    public int getId() {
        return id;
    }

    public Class getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(Class type) {
        this.type = type;
    }
}
