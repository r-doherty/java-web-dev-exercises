package exercises.technology;

public abstract class AbstractEntity {

    private static int count = 1;
    public int id = 1;

    public AbstractEntity () {
        id = count++;
    }

    public int getId()
    {
        return id;
    }

}
