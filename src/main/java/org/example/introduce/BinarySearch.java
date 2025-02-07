package org.example.introduce;

import java.util.List;

public class BinarySearch {
    List<Integer> numbersOrd;

    public BinarySearch(List<Integer> numbersOrd) {
        this.numbersOrd = numbersOrd;
    }

    public int binaryS (int target){
        int low = 0;
        int high = numbersOrd.size() - 1;


        while (low <= high)  {
            int mid = (low + high) / 2;
            if (target == numbersOrd.get(mid)){
                return mid;
            } else if (target < numbersOrd.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
