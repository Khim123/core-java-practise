public class Dog {
  public static void main(String[] args) {
    Animal a = new Animal();
    System.out.println(a.name);

    Animal b = new Animal("bhote kukur");
    b.setName("bhusyaha kukur");    

    System.out.println(b.name);
  }
}