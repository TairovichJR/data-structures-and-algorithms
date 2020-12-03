package arrays;

import java.util.*;

public class _Array {

    public static void main(String[] args) {

        Map<String, UserStats> map = new HashMap<>();
        UserStats u1 = new UserStats(Optional.of(1L));
        UserStats u2 = new UserStats(Optional.of(1L));
        UserStats u3 = new UserStats(Optional.of(1L));
        UserStats u4 = new UserStats(Optional.of(1L));
        UserStats u5 = new UserStats(Optional.empty());

        map.put("1", u1);
        map.put("2", u2);
        map.put("3", u3);
        map.put("5", u4);
        map.put("5", u5);

        System.out.println(count(map));
    }

    static Map<Long, Long> count(Map<String, UserStats>... visits) {
        Map<Long,Long> counts = new HashMap<>();
        if (visits == null){
            return counts;
        }else{
            Arrays.stream(visits).forEach(
                    visit -> {
                        visit.keySet().forEach( key ->{
                            if (key.matches("\\d*")){
                                UserStats userStat = visit.get(key);
                                if (userStat != null && userStat.getVisitCount().isPresent()){
                                    counts.put(Long.parseLong(key),userStat.getVisitCount().get());
                                }
                            }
                        });
                    }
            );
            return counts;
        }
    }
}

class UserStats {
    private Optional<Long> visitCount;

    public UserStats(Optional<Long> visitCount) {
        this.visitCount = visitCount;
    }
    public Optional<Long> getVisitCount() {
        if (visitCount.isEmpty()) {
            return Optional.empty();
        }
        return visitCount;
    }
}