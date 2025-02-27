public class Main {
    public static void main(String[] args) {

        Exchange Exchange = new FakeExchange();
        Cash dollar = new Cash(Exchange, 100);
        System.out.println("Dollar: " + dollar.toString());

        Cash euro = dollar.in("Euro");
        System.out.println("Dollar to Euro: " + euro.toString());
    }
}