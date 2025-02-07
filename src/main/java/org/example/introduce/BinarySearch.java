package org.example.introduce;

import java.util.List;

public class BinarySearch {
    List<Integer> numbersOrd;

    public BinarySearch(List<Integer> numbersOrd){
        this.numbersOrd = numbersOrd;
    }

    public int binaryS (List<Integer> numbersOrd, int target){
        int low = 0;
        int high = numbersOrd.size() - 1;
        int mid = low + high / 2;
        while (low >= high){

            if (target == numbersOrd.get(mid)){
                return mid;
            } else if (target < numbersOrd.get(mid)){
                high = mid - 1;
            } else{
                low = mid + 1;
            }

        }
        return -1;
    }

}
