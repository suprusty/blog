package com.cisco.blog.exception.persistence;


public class TransactionException extends Exception
{
	private static final long serialVersionUID = 3980005279899683511L;
	
	private Exception _nestedException;
    
    /**
     * @param msg
     */
    public TransactionException(String msg)
    {
        this(msg, null);
    }
    
    /**
     * @param ex
     */
    public TransactionException(Exception ex)
    {
        this(ex.getMessage(), ex);
    }
    
    /**
     * @param msg
     * @param ex
     */
    public TransactionException(String msg, Exception ex)
    {
        super(msg);
        _nestedException = ex;
    }
    
    /**
     * @return
     */
    public Exception getNestedException()
    {
        return _nestedException;
    }
}