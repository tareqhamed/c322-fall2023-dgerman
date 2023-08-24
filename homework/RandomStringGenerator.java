import java.util.ArrayList;

public class RandomStringGenerator {
  public ArrayList<Range> aidan = new ArrayList<Range>();
  public static void main(String[] args) {
    RandomStringGenerator generator = new RandomStringGenerator();
    // System.out.println( generator );
    generator.addRange('a', 'z');
    generator.addRange('A', 'Z');
    String s = generator.nextString(10);
    System.out.println( s );
  }
  public void addRange(char start, char stop) {
    this.aidan.add(new Range(start, stop));
    System.out.println( this.aidan );
  }
  public String nextString(int length) {

    return "something";
  }
}
