package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSortedArr {
    //brute force approach
    //Time Complexity: O(n1+n2) + O(n1+n2) + O(nlogn) => O((n1+n2)log(n1+n2))
    //Space Complexity: O(n1+n2)
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        for(int num : set){
            list.add(num);
        }
        Collections.sort(list);
        return list;

    }

    //optimal approach
//    Time Complexity: O(n1+n2)
//    Space Complexity: O(n1+n2)
    public static ArrayList<Integer> findUnionO(int a[], int b[]) {
        ArrayList<Integer> unionarr=new ArrayList<>();
        int n1=a.length;
        int n2=b.length;
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                if(unionarr.size()==0 || unionarr.get(unionarr.size()-1)!=a[i]){
                    unionarr.add(a[i]);
                }
                i++;
            }
            else{
                if(unionarr.size()==0  || unionarr.get(unionarr.size()-1)!=b[j]){
                    unionarr.add(b[j]);
                }
                j++;
            }
        }
        while(i<n1){
            if(unionarr.size()==0 || unionarr.get(unionarr.size()-1)!=a[i]){
                unionarr.add(a[i]);
            }
            i++;
        }

        while(j<n2){
            if(unionarr.size()==0 || unionarr.get(unionarr.size()-1)!=b[j]){
                unionarr.add(b[j]);
            }
            j++;
        }
        return unionarr;

    }
}
