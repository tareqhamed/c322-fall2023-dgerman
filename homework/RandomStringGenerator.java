import java.util.ArrayList;
public class RandomStringGenerator {
  public ArrayList<Range> aidan = new ArrayList<Range>(); // outside of a constructor
  public static void main(String[] args) {
    RandomStringGenerator generator = new RandomStringGenerator();
    // System.out.println( generator );
    generator.addRange('a', 'z');
    generator.addRange('A', 'Z');
    generator.addRange('0', '9');
    String s = generator.nextString(Integer.parseInt(args[0]));
    System.out.println( s );
  }
  public void addRange(char start, char stop) {
    this.aidan.add(new Range(start, stop));
    System.out.println( this.aidan );
  }
  public String nextString(int length) {
    String answer = "";
    for (int i = 0; i < length; i++) {
       int j = (int)(Math.random() * aidan.size());
       //  System.out.println(j);
       answer += (this.aidan.get(j).ross() + "");
    }
    return answer;
  }
}
