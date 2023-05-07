/*
 * nombre entier : 14
 *                 18_666
 *                 100_000_000_000
 * séparateur "_" pour les grands nombres
 * 
 * base numériques : décimales (base 10 -> 0 à 9)
 *                   binaire (base 2 -> 0 à 1) ex : 0b11001111
 *                   octale (base 8 -> 0 à 7) ex : 0755
 *                   hexadecimale (base 16 -> 0 à F) ex : 0xAF55
 * 
 * commande \ : \n -> nouvelle ligne
 *              \t -> tabulation
 *              \r -> retour chariot
 *              \b -> retour arrière
 *              \f -> nouvelle page
 *              ces commandes doivent etre implanter dans unz zone de texte
 * 
 *  = Affectations
 *  + Concaténation
 *  ! Inversion/Négation
 * 
 * A++ post-incrementation | ++A pré-incrementation
 * A-- post-décrementation | --A pré-décrementation
 * 
 * && ET
 * || OU
 * 
 */


public class MainApp{
    public static void main(String[] args)
    {
        int age = 24; //age <- 24
        int x = 1;
        age += x;

        System.out.println("Tu as " + age + " ans");
    }

    
}
