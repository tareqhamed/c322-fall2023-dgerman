package lab3;

public class Greeter
{
   /**
      Constructs a Greeter object that can greet a person or 
      entity.
      @param aName the name of the person or entity who should
      be addressed in the greetings.
   */
   public Greeter(String aName)
   {
      name = aName;
   }

   /**
      Greet with a "Goodbye" message.
      @return a message containing "Goodbye" and the name of
      the greeted person or entity.
   */
   public String sayGoodbye()
   {
      return "Goodbye, " + name + "!";
   }

   /**
      Greet with a "Hello" message.
      @return a message containing "Hello" and the name of
      the greeted person or entity.
   */
   public String sayHello()
   {
      return "Hello, " + name + "!";
   }

   private String name;
}
