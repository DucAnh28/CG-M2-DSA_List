package BT1_ArraylistMethod;

public class MyList <E>{
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
    }

    public MyList(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }

    public void add(int index, E element){
        if (index <0 || index > size){
            System.out.println("");
        }
    }

    public int size(){return size;}

    public
}
