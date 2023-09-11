/**
    A first-in, first-out bounded collection of messages.
*/
public class MessageQueue
{
   /**
       Constructs an empty message queue.
       @param capacity the maximum capacity of the queue
       @precondition capacity > 0
   */
   public MessageQueue(int capacity)
   {
      elements = new Message[capacity];
      count = 0;
      head = 0;
      tail = 0;
   }

   /**
       Remove message at head.
       @return the message that has been removed from the queue
       @precondition size() > 0
   */
   public Message removeFirst()
   {
      int before = (tail-head-count)%elements.length;//calculate equation before remove

      Message r = elements[head];
      head = (head + 1) % elements.length;
      count--;
      int after = (tail-head-count)%elements.length;//calculate the equation after remove
      assert after == before : " Changed!";
      return r;
   }

   /**
       Append a message at tail.
       @param aMessage the message to be appended
   */
   public void add(Message aMessage)
   {
       int before = (tail-head-count)%elements.length;//calculate the equation before add
       count++;//update count here. it is incorrect in the book
      // precondition size() < getCapacity(); no longer required
      if (count == elements.length)  // ie size() == getCapacity()
      {
         // Double the array size (amortized doubling)
         int newSize = 2 * elements.length;
         Message[] newElements = new Message[newSize];
         int i = 0;
         for (Message e : elements)
         {
            newElements[i] = e;
            i++;
         }
         elements = newElements;
      }

      elements[tail] = aMessage;
      tail = (tail + 1) % elements.length;
      //count++; // this was the original location of cout update.
      int after = (tail-head-count)%elements.length;//calculate eqution after add
      assert after == before : " Changed!";
   }

   /**
       Get the total number of messages in the queue.
       @return the total number of messages in the queue
   */
   public int size()
   {
      return count;
   }

   /**
       Get the maximum number of messages in the queue.
       @return the capacity of the queue
   */
   public int getCapacity()
   {
      return elements.length;
   }


   /**
       Get message at head.
       @return the message that is at the head of the queue
       @precondition size() > 0
   */
   public Message getFirst()
   {
      return elements[head];
   }

   private Message[] elements;
   private int head;
   private int tail;
   private int count;
}
