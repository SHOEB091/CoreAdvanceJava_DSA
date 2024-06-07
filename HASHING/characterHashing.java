package HASHING;

import java.util.*;

public class characterHashing {

    //Given the string: “abcdabefc” we are given some queries: [a, c, z]. For each query, we need to find out how many times the character appears in the string. For example, if the query is ‘a’ our answer would be 2, and if the query is ‘z’ the answer will be 0.


//CASE1: In this case, we can map the characters like:
//
//‘a’ -> 0, ‘b’ -> 1, ‘c’ -> 2,....., ‘z’ -> 25.
//In order to get the corresponding value for a character, we will use the following formula:
//
//corresponding value = given character – ‘a’
//
//For example, if the given character is ‘f’, we will get the value as (‘f’ – ‘a’) = (102-97) = 5.  Here, we can easily observe that the maximum value can be 25.
//
//So, for character hashing in this case, we need a hash array of size 26. And while pre-storing we will do hash[s[i]-’a’] += 1 instead of hash[arr[i]] += 1, and while fetching we will do hash[character-’a’] instead of hash[number]. The rest of the methods will be as same as in the case of number hashing.

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s;
        s = sc.next();

        //precompute:
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            // fetch:
            System.out.println(hash[c - 'a']);
        }
    }

}


























