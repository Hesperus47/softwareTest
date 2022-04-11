package analysis.test2;

import analysis.test2.AbstractDir;

import java.util.ArrayList;

public class MyDirectory extends AbstractDir {
    private String name;
    private ArrayList<AbstractDir>children = new ArrayList<>();

    public MyDirectory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (AbstractDir entry : children){
            size += entry.getSize();
        }
        return size;
    }

    public AbstractDir add(AbstractDir entry){
        children.add(entry);
        entry.parent = this;
        return this;
    }
}
