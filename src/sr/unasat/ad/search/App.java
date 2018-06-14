package sr.unasat.ad.search;

public class App {

    public static void main(String[] args) {

        int[] array = {33,66,1,5,100,2000, 3000};

        System.out.println("[LinearySearch] -> Found at index: " + SearchService.linearySearch(array, 100));

        int[] arraySorted = {33,66,99,100,500};

        System.out.println("[BinarySearch] -> Found at index: " + SearchService.binarySearch(arraySorted, 99));
    }
}
