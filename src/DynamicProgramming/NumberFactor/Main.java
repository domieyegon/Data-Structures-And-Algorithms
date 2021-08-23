package DynamicProgramming.NumberFactor;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        NumberFactor numberFactor = new NumberFactor();
        System.out.println(numberFactor.waysToGetNTopDown(5));

        System.out.println(numberFactor.waysToGetNBottomUp(5));

        HashMap<Character, Integer> map = new HashMap<>();

        String names ="Dominic Yegon";
        for (Character name: names.toCharArray()) {
            if (Character.isLetter(name)) {
                Character ch = Character.toLowerCase(name);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }

        }
        System.out.println(map.toString());
    }
}
