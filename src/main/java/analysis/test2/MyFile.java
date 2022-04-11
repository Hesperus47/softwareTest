package analysis.test2;

import analysis.test2.AbstractDir;

public class MyFile extends AbstractDir {
    private String name;
    private int size;

    public MyFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
