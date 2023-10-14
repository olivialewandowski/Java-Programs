/*
This program was created by Olivia Lewandowski on April 1 2023 
This program creates a queue class that can empty, dequeue, enqueue, and get size, and these methods are performed on an object of the Queue class.
 */

public class QueueDemo 
{
    public static void main (String [] args)
    {
        //first, create an object of the queue class, called queue
        Queue queue = new Queue();

        //enqueue 20 numbers from 1 to 20 into the queue
        for(int i = 1; i <= 20; i++) 
        {
            queue.enqueue(i);
        }

        //remove and display the numbers from the queue, while the queue statement is not empty
        while(!queue.empty()) 
        {
            System.out.print(queue.dequeue() + " ");
        }
    }
}

class Queue
{
    //state: properties or attributes or data or fields 
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    //constructor - no arg, empty queue with default size of 8
    public Queue()
	{
		elements = new int[DEFAULT_CAPACITY];
	}

    //behavior - methods
    //getter - returns the number of elements in the stack 
    public int getSize() 
    {
        return size;
    }

    //other methods
    public void enqueue(int v)              //adds integers into the queue, but also doubles the array size (based on the default) once number of elements exceeds the size 
    {
        if (size == elements.length)        //indicates that size needs to be doubled, and doubles it
        {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = v;               //adds element v to the array, by setting it equal to an additional index of the array
    }

    public int dequeue()
    {
        if (size == 0) 
        {
            return 0;
        } 
        else 
        {
            //removes the first element from the queue and shift all other elements to the left
            int firstElement = elements[0];
            for (int i = 1; i < size; i++) 
            {
                elements[i-1] = elements[i];
            }
            size--;
            return firstElement;
        }
    }

    public boolean empty() 
    {
        return size == 0;
    }
}