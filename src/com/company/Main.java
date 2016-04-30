package com.company;

import com.google.common.base.CharMatcher;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args)throws Exception {
        int upperLimit =1000000;

        ArrayList<Integer> circularPrimes = new ArrayList<>();

        for(int i =0 ; i<upperLimit ; i++)
        {
            /*Оскльки circular prime можуть складатися тільки з чисел  1,3,7,9,
             то відразу відкидаємо всі інші.
            */
            if(CharMatcher.anyOf("1379").matchesAllOf(Integer.toString(i)))
            {

                if(isPrime(i))
                {
                    circularPrimes.add(i);
                   // System.out.println(i);
                }
            }

        }

        System.out.println("\n Circular primes count: "+circularPrimes.size());

    }

    static boolean isPrime(int n)
    {
        if (n%2==0) return false;

        for(int i=3;i*i<=n;i+=2)
        {
            if(n%i==0) return false;
        }

        return true;
    }
}
