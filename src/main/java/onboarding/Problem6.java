package onboarding;

import java.util.*;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        HashSet<String> answerSet = new HashSet<>();

        for (List<String> form : forms) {
            String name = form.get(1);
            for (int i = 0; i < name.length() - 1; i++) {
                for (int j = i + 2; j < name.length() + 1; j++) {
                    hashMap.put(name.substring(i, j), hashMap.getOrDefault(name.substring(i, j), -1) + 1);
                }
            }
        }

        for (List<String> form : forms) {
            for (Map.Entry<String, Integer> stringIntegerEntry : hashMap.entrySet()) {
                if (form.get(1).contains(stringIntegerEntry.getKey())&&stringIntegerEntry.getValue()>1) {
                    answerSet.add(form.get(0));
                }
            }

        }
        List<String> answer = new ArrayList<>(answerSet);
        Collections.sort(answer);


        return answer;
    }
}
