public class Principal {
    public static void main(String args[]) {
        Trabalhador severino = new Trabalhador("sapato", 500);
        Trabalhador raimundo = new Trabalhador("bota", 500);
        Trabalhador tucano = new Trabalhador("Tênis", 500);
        Trabalhador ciclano = new Trabalhador("meia", 500);
        severino.start();
        raimundo.start();
        tucano.start();
        ciclano.start();
    }
}