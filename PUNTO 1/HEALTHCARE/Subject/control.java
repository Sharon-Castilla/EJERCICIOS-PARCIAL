import Eventos.Examenes;
import Observer.JefeBacteriologia;

public class control implements subject {
     private Set<JefeBacteriologia> subscribers = new LinkedHashSet<>();
     private List<Examenes> lots = new ArrayList<>();
     @Override
    public void subscribe(JefeBacteriologia observer) {
        if (observer == null) {
            throw new IllegalArgumentException("Observer cannot be null");
        }
        subscribers.add(observer);
    }
    @Override
    public void unsubscribe(JefeBacteriologia observer) {
        subscribers.remove(observer); 


    }

}