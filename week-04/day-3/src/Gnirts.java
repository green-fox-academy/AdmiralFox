public class Gnirts implements CharSequence{

  String example;

  public Gnirts(String example) {
    this.example = example;
  }

  public String getExample() {
    return example;
  }

  public void setExample(String example) {
    this.example = example;
  }

  @Override
  public int length() {
    return example.length();
  }

  @Override
  public char charAt(int index) {
    for (char raw: example) {
      return example.charAt(raw);
    }
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
