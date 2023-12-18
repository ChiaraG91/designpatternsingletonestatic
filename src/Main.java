public class Main {

    public static void main(String[] args){

        User user1 = User.getUser();
        user1.stampaDettagli();

        User user2 = User.getUser();
        user2.setNome("Mario");
        user2.setEta(16);
        user2.stampaDettagli();

    }
}
