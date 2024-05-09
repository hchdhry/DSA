public class DynamicArray {

    int capacity = 10;
    int size;
    Object[] array;

    public DynamicArray()
    {
        this.array = new Object[capacity];
    }
    public DynamicArray(int Capacity)
    {
        this.capacity = Capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data)
    {
        if(size >= capacity)
        {
            grow();
        }
        array[size] = data;
        size++;

    }
    public void insert(int index,Object data)
    {
        if(size >= capacity)
        {
            grow();
        }
        for (int i = size; i > index; i--) {

            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;

    }
    public void delete(Object data)
    {

    }
    public int search()
    {
        return 8;
    }

    private void grow()
    {

    }
    
    private void shrink() 
    {

    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    public String toString()
    {
        String result = "";
        for (Object object : array) {
            result+=object;
        }
        System.out.println(result);
        return result;
    }
}
