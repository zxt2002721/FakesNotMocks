public class FakeExchange implements Exchange {
  @Override
  public float rate(String origin, String target) {
      return 1.2f;
  }
}