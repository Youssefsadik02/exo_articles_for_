package fr.dampierre;
    import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Saisir le nombre totale d'articles:");
        int nbrArticles= sc.nextInt();
        double somme=0;
        for (int i=1; i<=nbrArticles; i++){
        System.out.println("prix de l'article "+i+" :");
            somme+= sc.nextInt();
        }
    System.out.println("votre totale est: "+somme);
    }
    
}
