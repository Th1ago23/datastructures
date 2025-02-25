package org.example.introduce;

import java.util.ArrayList;

public interface MinNum {

    public default int minNumber(ArrayList<Integer> n, int menor){
        menor = n.get(0);
        for (int i=1; i<n.size();i++){
            if (menor >  n.get(i)){
                menor = n.get(i);
            };
        }
        return menor;
    }
}
