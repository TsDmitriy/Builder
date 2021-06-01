public class Main {
    public static void main(String[] args) {
        User user = new UserBuilderImpl().setName("Дима").setGender(Gender.Man).build();
        user.print ();
    }
}
