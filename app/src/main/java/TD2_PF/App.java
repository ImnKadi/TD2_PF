/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package TD2_PF;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class App {

    public static void QST1() {

        System.out.print("Somme et Sommable");
        // Somme des 2 entiers
        Somme<Integer> integerSomme = (var1, var2) -> var1 + var2;
        System.out.println(integerSomme.somme(20, 20));

        // Somme des 2 doubles
        Somme<Double> doubleSomme = ((var1, var2) -> var1 + var2);
        System.out.println(doubleSomme.somme(20.0, 20.0));
        // Somme des 2 longs

        Somme<Long> longSomme = (var1, var2) -> (var1 + var2);
        System.out.println(longSomme.somme(1L, 1L));

        // Somme des 2 Strings

        Somme<String> stringSomme = (var1, var2) -> (var1 + var2);
        System.out.println(stringSomme.somme("un", "deux"));
    }

    public static void QST2() {

        final List<String> l2s = List.of("Un", "deux");
        final Map<String, Integer> m2s = Map.of("e1", 1, "e2", 2);
    }

    public static void QST3() {

        System.out.println("Function convertit un type en un autre type et prend en argument type T");
        System.out.println("Predicate est de type booléen teste un argument et renvoie vrai ou faux. Elle est du type T");
        System.out.println("Consumer consomme une entrée et ne retourne rien. Consumer est de type T");
        System.out.println("Supplier génère une sortie retourne une valeur et ne retourne pas d'argument. Elle est de type T");
    }


    public static void EXO2QST1() {

        Predicate<Integer> tropPetit = taille -> taille < 100;
        Predicate<Integer> tropGrand = taille -> taille > 200;
        Predicate<Integer> TailleIncorrecte = tropPetit.or(tropGrand);
        Predicate<Integer> TailleCorrecte = TailleIncorrecte.negate();
        Predicate<Double> tropLourd = poids -> poids > 150.0;
        Predicate<Double> PoidsIncorrecte = tropLourd;
        Predicate<Double> PoidsCorrecte = tropLourd.negate();
    }


    // Exo2QST2
    public static class Paire<T, U> {
        public T fst;
        public U snd;

        public Paire(T fst, U snd) {
            this.fst = fst;
            this.snd = snd;
        }

        @Override
        public String toString() {
            return String.format("(%s,%s)", fst.toString(), snd.toString());
        }
    }

    public static <T> Predicate<T> conjonction(List<Predicate<T>> conditions){
        Predicate<T> predicate = x -> true;


        return  null;

    }

    // Non finie
    public static <T> List<T> filtragePredicatif(List<Predicate<T>> conditions, List<T> elements){

        return elements;
    }




}
