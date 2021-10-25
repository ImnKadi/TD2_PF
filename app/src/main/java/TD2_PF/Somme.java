package TD2_PF;

@FunctionalInterface

public interface Somme<T> {

    T somme(T var1, T var2);

    Somme<Integer> sommeInt = new Somme<Integer>() {
        @Override
        public Integer somme(Integer var1, Integer var2) {
            return var1 + var2;
        }
    };

}
