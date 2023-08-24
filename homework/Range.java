public class Range {
  char start, stop;
  public Range(char start, char stop) {
    this.start = start;
    this.stop = stop;
  }
  public char ross() {
    return (char) (start + (int) (Math.random() * (stop - start +  1)));
  }
}
