/**
  * file: queueStack.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Lab 7
  * due date: April 25, 2017
  * version: 1.0
  * 
  */

/*******************
*      Queue       *
*------------------*
* -elements: int[] *

* -size: int       *

* Queue()          *

* enqueue(v: int)  *

* dequeue(): int   *

* empty(): boolean *

* getSize(): int   *
*******************/

/**
  * queueStack
  * 
  * This class allows for the creation of a 
  * queue as well as displaying 20 numbers
  * removed from the queue.
  */
  
public class queueStack {
public static void main(String[] args) {
  Queue queue = new Queue();
  for (int i = 1; i <= 20; i++) {
    queue.enqueue(i);
    }
  while (!queue.empty()) {
    System.out.print(queue.dequeue() + " ");
    }
  System.out.println();
  }
	
/**
  * Queue
  * 
  * This class allows for the size of the 
  * array queue to be set to 8.
  */
  
  public static class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;
    Queue() {
      elements = new int[DEFAULT_CAPACITY];
      }
	  
/**
  * enqueue
  * 
  * This class allows for the adding of 20
  * numbers from 1 to 20 into the queue.
  */
  
    public void enqueue(int v) {
      if (size >= elements.length) {
        int[] temp = new int[elements.length * 2];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        elements = temp;
        }
      elements[size++] = v;
      }
	  
/**
  * dequeue
  * 
  * This int takes the 20 numbers previously
  * added into the queue and prepares them for
  * displaying.
  */
  
    public int dequeue() {
      int v = elements[0];
      int[] temp = new int[elements.length];
      System.arraycopy(elements, 1, temp, 0, size);
      elements = temp;
      size--;
      return v;
      }
	  
/**
  * empty
  * 
  * This boolean checks to see if the current 
  * queue is empty by checking it's current
  * size.
  */
  
    public boolean empty() {
      if(size == 0)
        return true;
      else
        return false;
      }
	  
/**
  * getSize
  * 
  * This class allows for the program to get the
  * current size of the queue.
  */
  
    public int getSize() {
      return size;
      }
    }
  }