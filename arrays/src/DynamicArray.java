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
        if(size >= capacity-2)
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
            array[i] = array[i-1];
        }
        array[index] = data;
        size++;
       

    }
    public void delete(Object data)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==data)
            {
                for(int j = 0 ;j<size-i-1;j++)
                {
                    array[i+j] = array[i+j+1];
                }
                array[size-1] = null;
                size--;
                if(size<=(int)(capacity/3))
                {
                    shrink();
                }
                break;
            }

        }

    }
    public int search(Object data)
    {
       for(int i = 0;i<size;i++)
       {
        if (array[i]==data) {
            return i;
        }
       }
       return -1;
    }

    private void grow()
    {
        int newCapacity = (int)capacity*2;
        Object[] newArray = new Object[newCapacity];
        for(int i = 0;i<capacity;i++)
        {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;

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
        System.out.println(array.length);
        System.out.println(this.size);
        return result;
    }
}
