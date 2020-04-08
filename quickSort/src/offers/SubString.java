package offers;

public class SubString {
    public String subString(String arr, int k) {
        String right = arr.substring(k); // cut before index k
        String left = arr.substring(0, k); // cut from index 0 to k - 1
        return right + left;
    }
}

//Java data types ?
