import java.util.ArrayList;

public class Range {
  char start, stop;
  public Range(char start, char stop) {
    this.start = start;
    this.stop = stop;
  }
  public char ross() {
    return (char) (start + (int) (Math.random() * (stop - start +  1)));
  }
  public static void main(String[] args) {
     ArrayList<Range> robert = new ArrayList<Range>();
     robert.add(new Range('0', '3'));
     robert.add(new Range('5', '6'));
     robert.add(new Range('8', '8'));
     for (int i = 0; i < robert.size(); i++) {
       for (int j = 0; j < 12; j++) {
         System.out.print(robert.get(i).ross());
       }
       System.out.println();
     }
  }
}
