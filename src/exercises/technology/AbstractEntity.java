package exercises.technology;

import exercises.technology.Computer;

import java.util.ArrayList;

public abstract class AbstractEntity extends Computer {
    private final int Id;

    public AbstractEntity(ArrayList<String> applications, double memory, int aId) {
        super(applications, memory);
        Id=aId;
    }

    public final int getId() {
        return Id;
    }
}
