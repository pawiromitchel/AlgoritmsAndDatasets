package sr.unasat.ad.search;

public class SearchService {

    public static int linearySearch(int[] array, int searchTerm){
        for (int i = 0; i < array.length; i++){
            if(array[i] == searchTerm){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int searchTerm){
        int low = 0; // lowest value will always start at index 0
        int mid;
        int high = array.length; // highest value will always be at the last index

        while (low <= high){
            mid = (low + high) / 2;
            if (array[mid] > searchTerm) {
                high = mid - 1;
            } else if (array[mid] < searchTerm) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // TODO
    public static String linearySearchString(){
        return "ja";
    }
}
