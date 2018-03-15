public class EmptyStackException extends Exception
{
    private static final long serialVersionUID = 2L;
    public EmptyStackException()
    {
        super();
    }

    public EmptyStackException(String msg)
    {
        super(msg);
    }
}
