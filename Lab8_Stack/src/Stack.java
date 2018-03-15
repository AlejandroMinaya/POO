public class Stack<T>
{
    private int lastIndex = 0;
    private T top = null;
    private int max = 100;
    private Object[] elements;

    public Stack()
    {
        elements = new Object[max];
    }


    public T top() throws EmptyStackException
    {
        if(top == null)
            throw new EmptyStackException("El Stack esta vacio");
        else return top;
    }

    @SuppressWarnings("unchecked")
    public void push(T element) throws FullStackException
    {
        if(lastIndex >= max)
            throw new FullStackException("El Stack esta lleno");
        else
        {
            elements[lastIndex] = element;
            top = (T)elements[lastIndex];
            lastIndex++;
        }
    }

    @SuppressWarnings("unchecked")
    public T pop() throws EmptyStackException
    {

        T lastTop = top;
        if(lastIndex <= 0)
            throw new EmptyStackException("El Stack esta vacio");
        else if(lastIndex == 1)
        {
            elements[0] = null;
            lastIndex = 0;
            top = null;
        }
        else
        {
            elements[lastIndex-1] = null;
            lastIndex--;
            top = (T)elements[lastIndex-1];
        }
        return lastTop;
    }

}
