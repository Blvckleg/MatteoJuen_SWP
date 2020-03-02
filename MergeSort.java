import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static List<Integer> mergeSort(List<Integer> uns) {
        if(uns.size() == 1) {
            return uns;
        }
        List<Integer> left = uns.subList(0, uns.size()/2);
        List<Integer> right = uns.subList(uns.size()/2, uns.size());

        return sort(mergeSort(left), mergeSort(right));
    }

    private static List<Integer> sort(List<Integer> left, List<Integer> right) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while(i + j <= left.size() + right.size()) {
            if(left.size() == i) {
                ret.addAll(right.subList(j, right.size()));
                return ret;
            }
            if (right.size() == j) {
                ret.addAll(left.subList(i, left.size()));
                return ret;
            }
            if (left.get(i) <= right.get(j)) {
                ret.add(left.get(i));
            }else {
                ret.add(right.get(j));
                j++;
            }
        }
        return ret;
    }

    public static void print(List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
}