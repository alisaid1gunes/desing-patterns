import java.util.ArrayList;
import java.util.List;

public class Teacher implements Subject{
    private List<Observer> observers;
    String message;
    boolean changed;
    private final Object MUTEX= new Object();

    public Teacher() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) {
            throw new NullPointerException("Null Observer");
        }
        synchronized (MUTEX) {
            if (!observers.contains(obj)) {
                observers.add(obj);
            }
        }

    }

    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX){
            observers.remove(obj);
        }

    }

    @Override
    public void notifyObservers() {
        List<Observer> observersIn = null;
        synchronized (MUTEX){
            if (!changed) {
                return;
            }
            observersIn = new ArrayList<>(this.observers);
            this.changed=false;
        }
        for (Observer obj : observersIn) {
            obj.update();
        }

    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;

    }

    public void postMessage(String msg){
        System.out.println("Message Posted to Topic:"+msg);
        this.message=msg;
        this.changed=true;
        notifyObservers();
    }
}
