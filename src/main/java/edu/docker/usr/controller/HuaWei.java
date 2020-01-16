package edu.docker.usr.controller;

import java.util.*;

public class HuaWei {
    public static int[] a = {1,2,-1};
    public static int b = 1;
    public static int sum = 0;
    public static int x;
    public static LinkedList<Integer> list = new LinkedList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        fst(1);
        System.out.println("23432141432");
        fst(2);
        System.out.println(sum);
    }

    static void fst(int mx){
        if(mx>=x){
            if(mx==x){
                sum++;
            }
        }else {
            System.out.println(Arrays.toString(list.toArray()));
            for (int i : a) {
                if (i == -1 && b == 1) {
                    b = 0;
                    list.push(i);
                    fst(mx + i);
                    list.pop();
                    b = 1;
                } else {
                    list.push(i);
                    fst(mx + i);
                    list.pop();
                }

            }
        }
    }
}
