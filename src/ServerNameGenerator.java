import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        Random adjectiveRandom = new Random();
        Random nounRandom = new Random();
        String[] adjectives = {"Illustrious", "Mesmerizing", "Spectacular", "Penultimate", "Auspicious","Valiant","Superficial", "Superfluous"
        , "Buoyant", "Fastidious"};
        String[] nouns = {"Photon", "Cactus", "Quasar", "Rainforest", "Demon", "Celery", "Mausoleum", "Apparatus", "Pokemon", "Cathedral"};

        for(int i = 1; i <=10; i++){
        int randomNumber=adjectiveRandom.nextInt(adjectives.length);
        int randomNumber2=nounRandom.nextInt(nouns.length);
        System.out.println(adjectives[randomNumber] + "-" + nouns[randomNumber2]);
        }
    }
}
