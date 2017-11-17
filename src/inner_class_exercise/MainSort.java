package inner_class_exercise;

public class MainSort {


    public static void main(String[] args) {


        Sortable sortable = new Sortable() {
            @Override
            public int[] sort(int[] tab) {
                for (int j = 0; j < tab.length; j++) {
                    for (int k = 0; k < tab.length - 1; k++) {
                        if (tab[k +1] < tab[k]) {
                            int temp;
                            temp = tab[k+1];
                            tab[k+1] = tab[k];
                            tab[k] = temp;


                        }
                    }
                }


                return tab;
            }
        };


        int[] tab = {12, 5, -2, 6, 89, 56, 32, 1, 24};
        sortable.sort(tab);
        for (int i =0; i<tab.length; i++){
            System.out.print(tab[i] + " ");
        }


    }
}
