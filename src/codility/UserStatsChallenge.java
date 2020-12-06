package codility;


import javax.swing.text.html.Option;
import java.util.*;

public class UserStatsChallenge {

    public static void main(String[] args) {

        UserStats u1 = new UserStats(Optional.of(1L));
        UserStats u2 = new UserStats(Optional.of(2L));
        UserStats u3 = new UserStats(Optional.of(3L));
    //        UserStats u4 = new UserStats(Optional.of(null)); //throwing NPE

        Map<String, UserStats> users = new HashMap<>();
        users.put("1", u1);
        users.put("2", u2);
        users.put("2", u3);
             users.put("3",u2);
       // users.put("4", null);

        System.out.println(count(users));
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



