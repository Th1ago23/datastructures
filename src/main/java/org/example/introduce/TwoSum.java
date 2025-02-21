package org.example.introduce;
import java.util.ArrayList;

//Fiz na maneira mais "Bruta" pra ter uma forma de pensar na maneira mais eficiente operacionalmente falando.
public interface TwoSum {
    public default ArrayList<Integer> numberToSum(ArrayList<Integer> n, int target){
        int comp = 0;
        ArrayList<Integer> numbers = new ArrayList<>(2);

        for (int i = 1;i < n.size(); i++){
            if(n.get(i) + n.get(comp) == target){
                numbers.add(i);
                numbers.add(comp);
                return numbers;
            }
            comp++;
        }
        return numbers;
    }
}
