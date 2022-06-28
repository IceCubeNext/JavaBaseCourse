public class MergeArrays {
    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        if(a1.length == 0){
            return a2;
        }
        if(a2.length == 0){
            return a1;
        }
        int[] result = new int[a1.length + a2.length];
        int a1_index = 0;
        int a2_index = 0;
        for(int i = 0; i < result.length; i++ ){
            if(a1_index < a1.length && a2_index < a2.length){
                if(a1[a1_index] < a2[a2_index]){
                    result[i] = a1[a1_index++];
                } else {
                    result[i] = a2[a2_index++];
                }
            } else {
                if(a1_index < a1.length){
                    result[i] = a1[a1_index++];
                } else {
                    result[i] = a2[a2_index++];
                }
            }
        }
        return result;
    }
}
