public class Main {
  public static void main(String[] args) {
    Soda добавка  = new Soda("малина");
    System.out.println("Газировка и "+ добавка.GetMyDrinkString());
    System.out.println();
    добавка.setДобавка("Обычная газировка");
    System.out.println(добавка);

  }
}
