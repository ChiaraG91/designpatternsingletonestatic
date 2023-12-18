public class User {

    private String nome;
    private Integer eta;

    private static User user;
    private User() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public static User getUser() {
        if(user == null){
            user = new User();
        }
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }

    public void stampaDettagli() {
        System.out.println("User " + ": " + "nome:" + getNome() + ", " + "età" + " " + getEta());
    }
}
