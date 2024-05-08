namespace test;
public class dynamicArray
{
    public int size;
    public int capacity = 10;
    object[] array;

    public dynamicArray()
    {
        this.array = new object[capacity];
    }
    public dynamicArray(int capacity)
    {
        this.capacity = capacity;
        this.array = new object[capacity];
    }


    public void add(object data)
    {
        if(size >= capacity)
        {
           capacity++
        }

    }
    public void insert(int Index,object data)
    {

    }

    public void delete(object data)
    {

    }
}