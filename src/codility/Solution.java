package codility;


import javax.swing.text.html.Option;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        UserStats u1 = new UserStats(Optional.of(1L));
        UserStats u2 = new UserStats(Optional.of(2L));
        UserStats u3 = new UserStats(Optional.of(3L));
    //    UserStats u4 = new UserStats(Optional.of(null)); throwing NPE

        Map<String, UserStats> users = new HashMap<>();
        users.put("1",u1);
        users.put("2",u3);
   //     users.put("3",u4);
        users.put("4",null);

        System.out.println(count(users));
    }

    static  Map<Long, Long> count(Map<String, UserStats>... visits) {
        Map<Long,Long> counts = new HashMap<>();
        if (visits == null)             return counts;
        Arrays.stream(visits).forEach(
                i -> {
                    System.out.println("hi here");
                    Map.Entry<String, UserStats> entry = i.entrySet().iterator().next();
                    String strKey = entry.getKey();
                    if(strKey.matches("\\d*")){
                     Long key = Long.parseLong(strKey);

                     Optional<Long> userStat = entry.getValue() == null ? null : entry.getValue().getVisitCount();
                     if (userStat != null && userStat.isPresent()){
                         if (counts.containsKey(key)){
                             Long addValue = counts.get(key) + userStat.get();
                             counts.put(key, addValue);
                         }else{
                             counts.put(key, userStat.get());
                         }
                     }
                    }
                }
        );
        return counts;
    }
}

class UserStats {
    private Optional<Long> visitCount;

    public UserStats(Optional<Long> visitCount) {
        this.visitCount = visitCount;
    }
    public Optional<Long> getVisitCount() {
        if (visitCount == null){
            return Optional.empty();
        }
        return visitCount;
    }
}

