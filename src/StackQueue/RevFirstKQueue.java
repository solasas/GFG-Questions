package StackQueue;

import java.util.Queue;
import java.util.Stack;

public class RevFirstKQueue {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        Stack<Integer> st=new Stack<>();
        // if(k>q.size()){
        //     return;
        // }
        if(q == null || k <= 0 || k > q.size())
            return q;

        for(int i=0;i<k;i++){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        int size=q.size();
        for(int i=0;i<size-k;i++){
            q.add(q.poll());
        }
        return q;

    }
}
